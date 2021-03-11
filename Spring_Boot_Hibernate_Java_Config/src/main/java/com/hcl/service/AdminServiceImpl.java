package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.dao.AdminDao;

import com.hcl.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao admindao;

	@Transactional
	public void saveAdmin(Admin admin) {

		admindao.saveAdmin(admin);
	}

	public void updateAdmin(Admin admin) {
		admindao.updateAdmin(admin);

	}

	public List<Admin> FetchAdmin() {
		// TODO Auto-generated method stub
		return admindao.FetchAdmin();
	}

	public Admin getAdminById(int id) {
		// TODO Auto-generated method stub
		return admindao.getAdminById(id);
	}

	public void deleteAdmin(Admin admin) {
		admindao.deleteAdmin(admin);

	}

}
