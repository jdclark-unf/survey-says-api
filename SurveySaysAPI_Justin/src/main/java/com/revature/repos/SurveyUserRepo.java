package com.revature.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.model.SurveyUser;
import java.util.List;

public interface SurveyUserRepo extends JpaRepository<SurveyUser, Integer>{
	SurveyUser findByUsernameAndPassword(String username, String password);

	SurveyUser createUser(int userId, String username, String password, String firstName, String lastName, String email);
}
