package com.hcl.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.model.User;
@Repository

public class UserDaoImpl implements UserDao{
	@Autowired
	SessionFactory sessionFactory;

	public void saveUser(User user) {

		sessionFactory.getCurrentSession().save(user);
	}

	public void deleteUser(User user) {
		sessionFactory.getCurrentSession().delete(user);

	}

	public void updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	public List<User> FetchUser() {
		@SuppressWarnings("unchecked")
		List<User> lu = sessionFactory.openSession().createQuery("from User").list();
		System.out.println(lu);
		return lu;
	}

	public User getUserById(int userId) {
		System.out.println("fetch method dao");
		User lu = (User) sessionFactory.openSession().createQuery("from User where userId=:userId")
				.setParameter("userId", userId).uniqueResult();
		return lu;
	}
}
