package com.hcl.service;

import java.util.List;

import com.hcl.model.User;

public interface UserService {

	public void saveUser(User user);

	public void deleteUser(User user);

	public void updateUser(User user);

	public List<User> FetchUser();

	public User getUserById(int userId);
}
