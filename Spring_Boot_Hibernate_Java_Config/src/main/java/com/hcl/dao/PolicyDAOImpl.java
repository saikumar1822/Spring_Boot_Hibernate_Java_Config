package com.hcl.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.hcl.model.Policy;

@Repository

public class PolicyDAOImpl implements PolicyDAO {

	@Autowired

	private SessionFactory sessionFactory;

	@Override

	public void save(Policy policy) {

		 sessionFactory.getCurrentSession().save(policy);
	}

	@Override
	public List<Policy> FetchPolicy() {
		@SuppressWarnings("unchecked")
		List<Policy> listPolicies = sessionFactory.openSession().createQuery("from Policy").list();
		System.out.println(listPolicies);
		return listPolicies;
	}

}
