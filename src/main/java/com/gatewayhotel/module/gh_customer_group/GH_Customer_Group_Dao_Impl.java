package com.gatewayhotel.module.gh_customer_group;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class GH_Customer_Group_Dao_Impl implements GH_Customer_Group_Dao{
	
	private EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
	    this.em = em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GH_Customer_Group> getAllCustomerGroups() {
		return em.createNativeQuery("select id from gh_customer_group", GH_Customer_Group.class).getResultList();
	}
 
	@Override
	@Transactional
	public Boolean insertNewCustomerGroup() {
		try{
			
			GH_Customer_Group gcg = new GH_Customer_Group();
			em.persist(gcg);
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
	public Boolean updateCustomerGroup() {
		try{
			
			GH_Customer_Group gcg = new GH_Customer_Group();
			em.merge(gcg);
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
	public List<GH_Customer_Group> searchCustomerGroups(String customerGroupSearchField) {
		return em.createNativeQuery("select id from gh_customer_group where id like '%"+customerGroupSearchField+"%'", GH_Customer_Group.class).getResultList();
	}

}

