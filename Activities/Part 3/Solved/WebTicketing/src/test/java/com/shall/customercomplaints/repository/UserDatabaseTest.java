package com.shall.customercomplaints.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shall.customercomplaints.integration.network.ControllerTest;
import com.shall.customercomplaints.model.User;

//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserDatabaseTest extends ControllerTest {

	private static final String ROOT_URL = "http://localhost:8082/v1/user/";
	private static final String FIRST_EMAIL = "mohamed.s.elshall2011@gmail.com";
	private static final String SECOND_EMAIL = "mohamed.s.elshall@gmail.com";
	private static final String THIRD_EMAIL = "john.doe@gmail.com";
	private static final String FIRST_NAME = "Mohamed S. El-Shall";

	@Test
	public void getAllUsers() {
		// Act
		List<User> users = usersRepository.findAll();
		// Assert
		assertThat(users.size(), Matchers.greaterThan(0));
		assertThat(users.size(), Matchers.greaterThanOrEqualTo(2));
	}

	@Test
	public void getUserById() {
		// Act
		User user = usersRepository.findOne(1);
		// Assert
		assertNotNull(user);
		assertThat(user.getEmail(), Matchers.equalTo(THIRD_EMAIL));
		assertThat(user.getName(), Matchers.equalTo("John Doe"));
	}

	@Test
	public void getUserByEmail() {
		User user = usersRepository.findByEmail(FIRST_EMAIL);
		assertNotNull(user);
		assertThat(user.getName(), Matchers.equalTo(FIRST_NAME));
		assertThat(user.getEmail(), Matchers.equalTo(FIRST_EMAIL));
	}

	@Test
	public void addNewUser() {
		// Arrange
		User user = new User();
		user.setEmail(THIRD_EMAIL);
		user.setCity("Earth city");
		user.setPassword("password");
		user.setName("John Doe");
		user.setUsername("john.doe.test");
		// Act
		User savedUser = usersRepository.save(user);
		// Assert
		assertThat(savedUser.getEmail(), Matchers.not((FIRST_EMAIL)));
		assertThat(savedUser.getName(), Matchers.equalTo("John Doe"));
		assertThat(savedUser.getEmail(), Matchers.equalTo(THIRD_EMAIL));
	}
}
