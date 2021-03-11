package com.hcl.service;

import java.util.List;

import com.hcl.model.Admin;



public interface AdminService {

	public void saveAdmin(Admin admin);

	public void deleteAdmin(Admin admin);

	public void updateAdmin(Admin admin);

	public List<Admin> FetchAdmin();

	public Admin getAdminById(int adminId);
}
