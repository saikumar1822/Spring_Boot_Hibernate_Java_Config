package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Policy;
import com.hcl.model.User;
import com.hcl.service.PolicyService;

@RestController

public class PolicyController {

	@Autowired

	private PolicyService policyService;

	@RequestMapping(value = "/addPolicy")

	public ModelAndView IndexPage(@ModelAttribute("policy") Policy policy)

	{
		return new ModelAndView("addPolicy");
	}

	@RequestMapping("/savePolicy")
	public ModelAndView Save(@ModelAttribute("policy") Policy policy)

	{
		policyService.savePolicy(policy);
		return new ModelAndView("addPolicy", "key1", "Policy details are added successfully");

	}

	@RequestMapping("viewPolicies")
	public ModelAndView view(@ModelAttribute("policy") Policy policy) {
		List<Policy> listPolicy = policyService.FetchPolicy();
		return new ModelAndView("ViewPolicy", "listPolicy", listPolicy);

	}

}
