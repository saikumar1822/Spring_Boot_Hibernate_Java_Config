package com.hcl.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.model.Admin;

@Repository
public class AdminDaoImpl implements AdminDao{

	@Autowired
	SessionFactory sessionFactory;

	public void saveAdmin(Admin admin) {

		sessionFactory.getCurrentSession().save(admin);
	}

	public void deleteAdmin(Admin admin) {
		sessionFactory.getCurrentSession().delete(admin);

	}

	public void updateAdmin(Admin admin) {
		sessionFactory.getCurrentSession().update(admin);
	}

	public List<Admin> FetchAdmin() {
		@SuppressWarnings("unchecked")
		List<Admin> lu = sessionFactory.openSession().createQuery("from Admin").list();
		System.out.println(lu);
		return lu;
	}

	public Admin getAdminById(int adminId) {
		System.out.println("fetch method dao");
		Admin lu = (Admin) sessionFactory.openSession().createQuery("from Admin where adminId=:adminId")
				.setParameter("adminId", adminId).uniqueResult();
		return lu;
	}
}
