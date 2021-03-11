package com.hcl.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Admin;
import com.hcl.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService adminservice;

	@RequestMapping("adminLoginForm")
	public ModelAndView adminFormPage(@ModelAttribute("admin") Admin admin) {
		return new ModelAndView("AdminLogin");

	}

	@RequestMapping("adminRegistrationForm")
	public ModelAndView adminLoginPage(@ModelAttribute("admin") Admin admin) {
		return new ModelAndView("AdminRegForm");

	}

	@RequestMapping("saveAdmin")
	public ModelAndView SavePage(@ModelAttribute("admin") Admin admin) {

		if (admin.getAdminId() == 0) {
			adminservice.saveAdmin(admin);

		} else {
			adminservice.updateAdmin(admin);
		}
		System.out.println("controller save  method");
		/*
		 * List<User> lp = userservice.FetchUser(); System.out.println(lp);
		 * System.out.println("controller save  method1"); return new
		 * ModelAndView("Success", "listUser", lp);
		 */
		return new ModelAndView("AdminLogin", "key", "Your details are submitted successfully");
	}

	@RequestMapping("fetchAdmin")
	public ModelAndView EditPage(@ModelAttribute("admin") Admin admin) {
		
		
		Admin admins = adminservice.getAdminById(admin.getAdminId());
		System.out.println("Databse Id: " + admins.getFirstName());
		// List<Person> lp=perdao.FetchPerson();
		if (admins.getAdminId() == admin.getAdminId()) {

			return new ModelAndView("Success1");

		} else {
			return new ModelAndView("AdminLogin");
		}

	}

	/*@RequestMapping("deleteemployee")
	public ModelAndView DeletePage(@ModelAttribute("user") User user, HttpServletRequest req) { // int
																								// id=Integer.parseInt(req.getParameter("id"));
		adminservice.deleteUser(user);
		List<User> lp = adminservice.FetchUser();
		return new ModelAndView("Success", "listperson", lp);

	}

	@RequestMapping("viewemp")
	public ModelAndView viewPage(@ModelAttribute("user") User user) {
		List<User> lp = adminservice.FetchUser();
		return new ModelAndView("Success", "listperson", lp);

	}*/

}
