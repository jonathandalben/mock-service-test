package com.gatewayhotel.module.gh_rooms;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class GH_Rooms_Dao_Impl implements GH_Rooms_Dao{
	
	private EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
	    this.em = em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GH_Rooms> getAllAvailableRooms() {
		return em.createNativeQuery("select id, r_roomNumber, r_roomCategory, r_roomRate, r_roomType from gh_rooms", GH_Rooms.class).getResultList();
	}

	@Override
	@Transactional 
	public Boolean insertNewRoom() {
		try{
			
			GH_Rooms gr = new GH_Rooms();
			gr.setRoomCategory("XXXX");
			gr.setRoomNumber("XXXX");
			gr.setRoomRate("XXXX");
			gr.setRoomType("XXXX");
			em.persist(gr);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			em.close();
		}
		return true;
	}
	
	@Override
	@Transactional
	public Boolean updateRoom() {
		try{
			
			GH_Rooms gr = new GH_Rooms();
			gr.setId(1);
			gr.setRoomCategory("BENIGA-NEW");
			gr.setRoomNumber("XXXX");
			gr.setRoomRate("XXXX");
			gr.setRoomType("XXXX");
			em.merge(gr);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			em.close();
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GH_Rooms> searchRooms(String roomSearchField) {
		return em.createNativeQuery("select id, r_roomNumber, r_roomCategory, r_roomRate, r_roomType from gh_rooms where id like '%"+roomSearchField+"%' or r_roomNumber like '%"+roomSearchField+"%' or r_roomCategory like '%"+roomSearchField+"%' or r_roomRate like '%"+roomSearchField+"%' or r_roomType like '%"+roomSearchField+"%'", GH_Rooms.class).getResultList();
	}

}

