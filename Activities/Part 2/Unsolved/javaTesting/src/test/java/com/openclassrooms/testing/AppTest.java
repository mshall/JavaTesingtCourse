package com.openclassrooms.testing;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//@RunWith(JUnitPlatform.class)
class AppTest {
	App app = new App();

	@Test
	void testGenerateRandomString() {
		String randomString = app.generateRandomString();
		Assertions.assertEquals(randomString, "Hello JUnit!");
	}
	
	

}
