package com.gatewayhotel.module.gh_check_out;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository 
public class GH_Check_Out_Dao_Impl implements GH_Check_Out_Dao{
	
	private EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
	    this.em = em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GH_Check_Out> getAllCheckOuts() {
		return em.createNativeQuery("select id, co_checkOut, co_room, co_customer, co_customerGroup from gh_check_out", GH_Check_Out.class).getResultList();
	}

	@Override
	@Transactional
	public Boolean insertNewCheckOut() {
		try{
			
			GH_Check_Out gco = new GH_Check_Out();
			em.persist(gco);
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
	public Boolean updateCheckOut() {
		try{
			
			GH_Check_Out gco = new GH_Check_Out();
			em.merge(gco);
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
	public List<GH_Check_Out> searchCheckOuts(String checkOutSearchField) {
		return em.createNativeQuery("select id, co_checkOut, co_room, co_customer, co_customerGroup from gh_check_out where id like '%"+checkOutSearchField+"%' or co_checkOut like '%"+checkOutSearchField+"%' or co_room like '%"+checkOutSearchField+"%' or co_customer like '%"+checkOutSearchField+"%' or co_customerGroup like '%"+checkOutSearchField+"%'", GH_Check_Out.class).getResultList();
	}

}

