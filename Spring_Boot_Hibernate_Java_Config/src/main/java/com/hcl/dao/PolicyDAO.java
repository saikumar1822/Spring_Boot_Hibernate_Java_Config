package com.hcl.dao;

import java.util.List;

import com.hcl.model.Policy;

public interface PolicyDAO {

	public abstract void save(Policy policy);

	public abstract List<Policy> FetchPolicy();

}
