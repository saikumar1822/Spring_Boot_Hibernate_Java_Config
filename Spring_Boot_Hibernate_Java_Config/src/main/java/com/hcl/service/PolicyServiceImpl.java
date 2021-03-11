package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.hcl.dao.PolicyDAO;
import com.hcl.model.Policy;

@Service

@Transactional

public class PolicyServiceImpl implements PolicyService {

	@Autowired

	PolicyDAO policyDao;

	@Override

	public void savePolicy(Policy policy) {

		 policyDao.save(policy);
		

	}

	@Override
	public List<Policy> FetchPolicy() {
		return policyDao.FetchPolicy();
	}

}
