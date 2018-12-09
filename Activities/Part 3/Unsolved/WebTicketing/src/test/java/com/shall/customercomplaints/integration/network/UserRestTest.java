//package com.shall.customercomplaints.integration.network;
//
//import static org.junit.Assert.assertThat;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.hamcrest.Matchers;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.shall.customercomplaints.model.User;
//import com.shall.customercomplaints.network.response.ResponseVO;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//public class UserRestTest extends ControllerTest {
//
//	private static final String ROOT_URL = "http://localhost:8082/v1/user/";
//	private static final String FIRST_EMAIL = "mohamed.s.elshall2011@gmail.com";
//	private static final String SECOND_EMAIL = "mohamed.s.elshall@gmail.com";
//	private static final String THIRD_EMAIL = "john.doe@gmail.com";
//
//	@Test
//	public void getAllUsers() {
//		// Arrange
//		String url = ROOT_URL + "all";
//		List<User> usersListDB = usersRepository.findAll();
//		// Act
//		ResponseEntity<ResponseVO<Iterable<User>>> response = restTemplate.exchange(url, HttpMethod.GET, null,
//				new ParameterizedTypeReference<ResponseVO<Iterable<User>>>() {
//				});
//
//		// Assert
//		ResponseVO<Iterable<User>> users = response.getBody();
//		assertThat(response.getStatusCode(), Matchers.equalTo(HttpStatus.OK));
//		assertThat(users.getCode(), Matchers.equalTo(200));
//		List<User> usersList = new ArrayList<>();
//		users.getResults().forEach(usersList::add);
//		assertThat(usersList.size(), Matchers.greaterThanOrEqualTo(2));
//	}
//
//	@Test
//	public void getUserByUsername() {
//		// Arrange
//		String url = ROOT_URL + "mohamed";
//
//		// Act
//		ResponseEntity<ResponseVO<User>> response = restTemplate.exchange(url, HttpMethod.GET, null,
//				new ParameterizedTypeReference<ResponseVO<User>>() {
//				});
//
//		// Assert
//		ResponseVO<User> user = response.getBody();
//		assertThat(response.getStatusCode(), Matchers.equalTo(HttpStatus.OK));
//		assertThat(user.getCode(), Matchers.equalTo(200));
//		assertThat(user.getResults().getEmail(), Matchers.equalTo(SECOND_EMAIL));
//	}
//
//	@Test
//	public void getUserByEmail() {
//		String url = ROOT_URL + "?" + FIRST_EMAIL;
//		ResponseEntity<ResponseVO<User>> response = restTemplate.exchange(url, HttpMethod.GET, null,
//				new ParameterizedTypeReference<ResponseVO<User>>() {
//				});
//		ResponseVO<User> user = response.getBody();
//		assertThat(response.getStatusCode(), Matchers.equalTo(HttpStatus.OK));
//		assertThat(user.getCode(), Matchers.equalTo(200));
//		assertThat(user.getResults().getEmail(), Matchers.equalTo(FIRST_EMAIL));
//	}
//
//	@Test
//	public void addNewUser() {
//		// Arrange
//		User user = new User();
//		user.setEmail(THIRD_EMAIL);
//		user.setCity("Earth city");
//		user.setPassword("password");
//		user.setName("John Doe");
//		user.setUsername("john.doe.test");
//		HttpHeaders requestHeaders = new HttpHeaders();
//		requestHeaders.setContentType(MediaType.APPLICATION_JSON);
//		HttpEntity<?> httpEntity = new HttpEntity<Object>(user, requestHeaders);
//
//		// Act
//		ResponseEntity<ResponseVO<User>> response = restTemplate.exchange(ROOT_URL, HttpMethod.POST, httpEntity,
//				new ParameterizedTypeReference<ResponseVO<User>>() {
//				});
//
//		// Assert
//		ResponseVO<User> savedUser = response.getBody();
//		assertThat(response.getStatusCode(), Matchers.equalTo(HttpStatus.OK));
//		assertThat(savedUser.getCode(), Matchers.equalTo(200));
//		assertThat(savedUser.getResults().getEmail(), Matchers.not((FIRST_EMAIL)));
//		assertThat(savedUser.getResults().getName(), Matchers.equalTo("John Doe"));
//		assertThat(savedUser.getResults().getName(), Matchers.equalTo(FIRST_EMAIL));
//	}
//
//	@Test
//	public void deleteUserById() {
//		// Arrange
//		String url = ROOT_URL + "7";
//
//		// Act
//		ResponseEntity<ResponseVO<Boolean>> response = restTemplate.exchange(url, HttpMethod.DELETE, null,
//				new ParameterizedTypeReference<ResponseVO<Boolean>>() {
//				});
//
//		// Assert
//		ResponseVO<Boolean> user = response.getBody();
//		assertThat(user.getResults(), Matchers.equalTo(true));
//	}
//}