package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.SurveyUser;
import com.revature.services.SurveyUserService;

@RestController
@RequestMapping("survey_says")
public class SurveyController {
	
	@Autowired
	private SurveyUserService surveyUserService;
	
	@GetMapping
	public List<SurveyUser> findAll() {
		return surveyUserService.findAll();
	}
	
	@GetMapping("{id}") // change to "user/{id}" ?
	public SurveyUser findById(@PathVariable int id) {
		return surveyUserService.findById(id);
	}
	
	@PostMapping("login")
	public SurveyUser findByUsernameAndPassword(String username, String password) {
		return surveyUserService.findByUsernameAndPassword(username, password);
	}
	
	@PostMapping("register")
	public SurveyUser createUser(int userId, String username, String password, String firstName, String lastName, String email) {
		return surveyUserService.createUser(userId, username, password, firstName, lastName, email);
	}
}
