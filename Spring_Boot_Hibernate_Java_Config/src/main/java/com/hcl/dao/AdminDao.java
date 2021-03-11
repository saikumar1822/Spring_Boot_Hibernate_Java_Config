package com.hcl.dao;

import java.util.List;

import com.hcl.model.Admin;



public interface AdminDao {

	public void saveAdmin(Admin admin);

	public void deleteAdmin(Admin admin);

	public void updateAdmin(Admin admin);

	public List<Admin> FetchAdmin();

	public Admin getAdminById(int adminId);
}
