package com.gatewayhotel.module.gh_check_in;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository 
public class GH_Check_In_Dao_Impl implements GH_Check_In_Dao{
	
	private EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
	    this.em = em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GH_Check_In> getAllCheckIns() {
		return em.createNativeQuery("select id, ci_checkIn, ci_room, ci_customer, ci_customerGroup from gh_check_in", GH_Check_In.class).getResultList();
	}

	@Override
	@Transactional
	public Boolean insertNewCheckIn() {
		try{
			
			GH_Check_In gci = new GH_Check_In();
			gci.setId(null);
			gci.setCustomer(1);
			gci.setRoom(6);
			em.persist(gci);
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
	public Boolean updateCheckIn() {
		try{
			
			GH_Check_In gci = new GH_Check_In();
			em.merge(gci);
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
	public List<GH_Check_In> searchCheckIns(String checkInSearchField) {
		return em.createNativeQuery("select id, ci_checkIn, ci_room, ci_customer, ci_customerGroup from gh_check_in where id like '%"+checkInSearchField+"%' or ci_checkIn like '%"+checkInSearchField+"%' or ci_room like '%"+checkInSearchField+"%' or ci_customer like '%"+checkInSearchField+"%' or ci_customerGroup like '%"+checkInSearchField+"%'", GH_Check_In.class).getResultList();
	}

}

