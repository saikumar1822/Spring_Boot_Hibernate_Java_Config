package com.hcl.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name = "policy")

public class Policy {

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)

	private int policyId;

	private String policyName;

	private String policyType;

	private int durationOfPolicy;

	private long amountOfPolicy;

	private String companyName;

	public Policy() {

		super();

		// TODO Auto-generated constructor stub

	}

	public int getPolicyId() {

		return policyId;

	}

	public void setPolicyId(int policyId) {

		this.policyId = policyId;

	}

	public String getPolicyName() {

		return policyName;

	}

	public void setPolicyName(String policyName) {

		this.policyName = policyName;

	}

	public String getPolicyType() {

		return policyType;

	}

	public void setPolicyType(String policyType) {

		this.policyType = policyType;

	}

	public int getDurationOfPolicy() {

		return durationOfPolicy;

	}

	public void setDurationOfPolicy(int durationOfPolicy) {

		this.durationOfPolicy = durationOfPolicy;

	}

	public long getAmountOfPolicy() {

		return amountOfPolicy;

	}

	public void setAmountOfPolicy(long amountOfPolicy) {

		this.amountOfPolicy = amountOfPolicy;

	}

	public String getCompanyName() {

		return companyName;

	}

	public void setCompanyName(String companyName) {

		this.companyName = companyName;

	}

}
