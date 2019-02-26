package com.revature.services;
import java.util.List;
import java.util.Set;
import com.revature.model.SurveyUser;

public interface SurveyUserService {
	SurveyUser save(SurveyUser su);
	SurveyUser update(SurveyUser su);
	SurveyUser delete(SurveyUser su);
	
	List<SurveyUser> findAll();
	SurveyUser findById(int id);
	SurveyUser findByUsernameAndPassword(String username, String password);
	SurveyUser createUser(int userId, String username, String password, String firstName, String lastName, String email);
}
