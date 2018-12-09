package com.openclassrooms.testing;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//@RunWith(JUnitPlatform.class)
class AppTest {
	App app = null;

	@BeforeEach
	public void setup() {
		app = new App();
	}

	@Test
	void givenHelloStringWhenTestGenerateRandomStringThenReturnTrue() {
		String randomString = app.generateRandomString();
		Assertions.assertEquals(randomString, "Hello JUnit!");
	}

	@Test
	public void returnTrue() {
		assertTrue(app.returnTrue());
	}

	@Test
	public void givenFalseWhenTestReturnFalseThenReturnTrue() {
		assertFalse(app.returnFalse());
	}

	@Test
	public void givenNullWhenTestReturnNullThenReturnTrue() {
		assertNull(app.returnNull());
	}

	@Test
	public void givenNotNullWhenTestReturnNotNullThenReturnTrue() {
		assertNotNull(app.returnNotNull());
	}

	@Test
	public void givenArraysWhenTestReturnFirstArrayThenReturnTrue() {
		assertArrayEquals(app.returnFirstArray(), app.returnSecondArray());
	}
}
