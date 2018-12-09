package com.openclassrooms.testing;

/**
 * Hello world!
 *
 */
public class App {

	public String generateRandomString() {
		return "Hello JUnit!";
	}

	public boolean returnTrue() {
		return true;
	}

	public boolean returnFalse() {
		return false;
	}

	public App returnNull() {
		return null;
	}

	public App returnNotNull() {
		return this;
	}

	public int[] returnFirstArray() {
		return new int[] { 1, 2, 3, 4, 5 };
	}

	public int[] returnSecondArray() {
		return new int[] { 1, 2, 3, 4, 5 };
	}

	public int[] returnThirdArray() {
		return new int[] { 0, 1, 2, 3, 4, 5 };
	}
	
	
}
