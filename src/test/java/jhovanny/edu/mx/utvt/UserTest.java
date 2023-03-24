package jhovanny.edu.mx.utvt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jhovanny.edu.mx.utvt.data.entities.User;
import jhovanny.edu.mx.utvt.data.repositories.UserRepository;

@SpringBootTest
public class UserTest {
	@Autowired
	private UserRepository userReposiory;
	
	@Test
	public void createUser() {
		User user = new User("jhovanny", "123456");
		this.userReposiory.saveAndFlush(user);
	}
	
	@Test 
	public void actualizarUser() {
		User user = this.userReposiory.findById(1L).orElse(null);
		
		if (user != null) {
			user.setUsername("jhovanny00");
			this.userReposiory.saveAndFlush(user);
		}
	}
}
