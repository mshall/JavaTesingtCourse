package com.openclassrooms.testing;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
class AppTest {
	App app = null;

	@BeforeAll
	static void setUp() {
		System.out.println("@BeforeAll will be called only once");
	}

	@BeforeEach
	void setUpEachTime() {
		app = new App();
		System.out.println("@BeforeEach is executed before each test case");
	}

	@AfterEach
	void tearDownEach() {
		System.out.println("@AfterEach is executed after each test case");
	}

	@AfterAll
	static void tearDown() {
		System.out.println("@AfterAll is executed once");
	}

	@Test
	void givenHelloStringWhenTestGenerateRandomStringThenReturnTrue() {
		String randomString = app.generateRandomString();
		Assertions.assertEquals(randomString, "Hello JUnit!");
	}

	@Test
	public void givenTrueWhenTestReturnTrueThenReturnTrue() {
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
