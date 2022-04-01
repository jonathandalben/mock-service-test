package com.gatewayhotel.module.gh_customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class GH_Customer_Dao_Impl implements GH_Customer_Dao{
	
	private EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
	    this.em = em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GH_Customer> getAllCustomers() {
		return em.createNativeQuery("select id, c_firstName, c_lastName, c_middleName, c_salutation, c_mobile, c_phone, c_room, c_customerGroup from gh_customer", GH_Customer.class).getResultList();
	}
 
	@Override
	@Transactional
	public Boolean insertNewCustomer() {
		try{
			
			GH_Customer gc = new GH_Customer();
			em.persist(gc);
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
	public Boolean updateCustomer() {
		try{
			
			GH_Customer gc = new GH_Customer();
			em.merge(gc);
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
	public List<GH_Customer> searchCustomer(String customerSearchField) {
		return em.createNativeQuery("select id, c_firstName, c_lastName, c_middleName, c_salutation, c_mobile, c_phone, c_room, c_customerGroup from gh_customer where id like '%"+customerSearchField+"%' or c_firstName like '%"+customerSearchField+"%' or c_lastName like '%"+customerSearchField+"%' or c_middleName like '%"+customerSearchField+"%' or c_salutation like '%"+customerSearchField+"' or c_mobile like '%"+customerSearchField+"%' or c_phone like '%"+customerSearchField+"%'", GH_Customer.class).getResultList();
	}

}

