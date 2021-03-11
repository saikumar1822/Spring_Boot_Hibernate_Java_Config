package com.hcl.service;

import java.util.List;

import com.hcl.model.Policy;

public interface PolicyService {

	public void savePolicy(Policy policy);

	public abstract List<Policy> FetchPolicy();

}