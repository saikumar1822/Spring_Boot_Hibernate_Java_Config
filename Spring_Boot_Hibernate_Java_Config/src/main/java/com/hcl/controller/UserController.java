package com.hcl.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Admin;
import com.hcl.model.User;
import com.hcl.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userservice;

	@RequestMapping("/")
	public ModelAndView IndexPage() {
		return new ModelAndView("Welcome");

	}
	@RequestMapping("userLoginForm")
	public ModelAndView userFormPage(@ModelAttribute("user") User user) {
		return new ModelAndView("UserLogin");

	}
	@RequestMapping("userRegistrationForm")
	public ModelAndView userLoginPage(@ModelAttribute("user") User user) {
		return new ModelAndView("UserRegForm");

	}

	@RequestMapping("saveUser")
	public ModelAndView SavePage(@ModelAttribute("user") User user) {
		
		if (user.getUserId() == 0) {
			userservice.saveUser(user);

		} else {
			userservice.updateUser(user);
		}
		System.out.println("controller save  method");
		/*List<User> lp = userservice.FetchUser();
		System.out.println(lp);
		System.out.println("controller save  method1");
		return new ModelAndView("Success", "listUser", lp);*/
		return new ModelAndView("UserLogin","key" ,"Your details are submitted successfully");
	}
	

	@RequestMapping("fetchUser")
	public ModelAndView EditPage(@ModelAttribute("user") User user) {
		//int userId = Integer.parseInt(req.getParameter("userId"));
		System.out.println(user.getUserId() + "UserId");
		int enteredUserId = user.getUserId();
		User users = userservice.getUserById(enteredUserId);
		System.out.println("Databse Id: " + users.getFirstName());
		// List<Person> lp=perdao.FetchPerson();
		if(users.getUserId()== enteredUserId){
			
			
			return new ModelAndView("Success1");
			
		}
		else{
			return new ModelAndView("UserLogin");
		}
		

	}

	@RequestMapping("deleteemployee")
	public ModelAndView DeletePage(@ModelAttribute("user") User user, HttpServletRequest req) { // int
																								// id=Integer.parseInt(req.getParameter("id"));
		userservice.deleteUser(user);
		List<User> lp = userservice.FetchUser();
		return new ModelAndView("Success", "listperson", lp);

	}

	@RequestMapping("viewemp")
	public ModelAndView viewPage(@ModelAttribute("user") User user) {
		List<User> lp = userservice.FetchUser();
		return new ModelAndView("Success", "listperson", lp);

	}
}
