package com.hcl.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.dao.UserDao;
import com.hcl.model.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;
	@Transactional
	public void saveUser(User user) {

		userdao.saveUser(user);
	}

	public void updateUser(User user) {
		userdao.updateUser(user);

	}

	public List<User> FetchUser() {
		// TODO Auto-generated method stub
		return userdao.FetchUser();
	}

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userdao.getUserById(id);
	}

	public void deleteUser(User user) {
		userdao.deleteUser(user);

	}

}
