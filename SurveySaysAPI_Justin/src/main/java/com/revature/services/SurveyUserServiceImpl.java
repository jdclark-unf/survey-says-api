package com.revature.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.SurveyUser;
import com.revature.repos.SurveyUserRepo;
import com.revature.services.SurveyUserService;

@Service
public class SurveyUserServiceImpl implements SurveyUserService{
	@Autowired
	private SurveyUserRepo surveyUserRepo;

	@Override
	public SurveyUser save(SurveyUser su) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SurveyUser update(SurveyUser su) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SurveyUser delete(SurveyUser su) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SurveyUser> findAll() {
		// TODO Auto-generated method stub
		return surveyUserRepo.findAll();
	}

	@Override
	public SurveyUser findById(int id) {
		// TODO Auto-generated method stub
		return surveyUserRepo.getOne(id);
	}

	@Override
	public SurveyUser findByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return surveyUserRepo.findByUsernameAndPassword(username, password);
	}

	@Override
	public SurveyUser createUser(int userId, String username, String password, String firstName, String lastName, String email) {
		// TODO Auto-generated method stub
		return surveyUserRepo.createUser(userId, username, password, firstName, lastName, email);
	}	

}
