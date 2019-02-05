package com.openclassrooms.testing;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssertionsTest {

	@Test
	public void SpeedCalculatorTest() {
		// Arrange
		int bmwSpeed = 260;
		int mercedesSpeed = 280;
		SpeedCalculator speedCalculator = new SpeedCalculator();
		// Act
		int speedDifference = speedCalculator.calculateDifference(mercedesSpeed, bmwSpeed);
		// Assert
		Assertions.assertEquals(speedDifference, 20);
	}

	public void testEqualsValues() {
		int bmwSpeed = 260;
		int mercedesSpeed = 260;
		int toyotaSpeed = 240;
		String speedTestFail = "Cars speed test failed";

		// Test will fail
		Assertions.assertEquals(bmwSpeed, toyotaSpeed, "BMW & Toyota speed test failed");

		// Test will fail with sppedTestFail Message
		Assertions.assertEquals(bmwSpeed, toyotaSpeed, speedTestFail);
		// Test will pass
		Assertions.assertEquals(bmwSpeed, mercedesSpeed);
	}

	public void testNotEqualsValues() {
		int bmwSpeed = 260;
		int mercedesSpeed = 300;
		int toyotaSpeed = 260;
		String speedTestFail = "Cars speed test failed";

		// Test will fail
		Assertions.assertNotEquals(bmwSpeed, toyotaSpeed, "BMW & Toyota speed test failed");

		// Test will fail with sppedTestFail Message
		Assertions.assertNotEquals(bmwSpeed, toyotaSpeed, speedTestFail);
		// Test will pass
		Assertions.assertNotEquals(bmwSpeed, mercedesSpeed);
	}

	@Test
	public void testTrueValues() {
		boolean isBMWFast = true;
		boolean isToyotaFast = false;
		String testMessage = "Test case failed!";
		// Will fail
		Assertions.assertTrue(isBMWFast);
		// Will pass
		Assertions.assertTrue(isToyotaFast);
		// Will fail with the testMessage
		Assertions.assertTrue(isBMWFast, testMessage);
	}

	@Test
	public void testFalseValues() {
		boolean isToyotaFast = false;
		boolean isBMWFast = true;
		String testMessage = "Test case failed!";
		// Will pass
		Assertions.assertFalse(isBMWFast);
		// Will fail
		Assertions.assertFalse(isToyotaFast);
		// Will fail with the testMessage
		Assertions.assertFalse(isToyotaFast, testMessage);
	}

	@Test
	public void testSomeNullValues() {
		String nullString = null;
		String brandNameString = "Mercedes Benz";
		String testMessage = "Assert null test case failed";
		// will pass
		Assertions.assertNull(nullString);
		// will fail
		Assertions.assertNull(brandNameString);
		// will fail with the testMessage
		Assertions.assertNull(brandNameString, testMessage);
	}

	@Test
	public void testSomeNotNullValues() {
		String nullString = null;
		String brandNameString = "Mercedes Benz";
		String testMessage = "Assert null test case failed";
		// will pass
		Assertions.assertNotNull(brandNameString);
		// will fail
		Assertions.assertNotNull(nullString);
		// will fail with the testMessage
		Assertions.assertNotNull(nullString, testMessage);
	}

	@Test
	public void testSame() {
		String brandNameString = "Mercedes Benz";
		String anotherBrandNameString = "Mercedes Benz";
		String differentbrandNameString = "Toyota";
		// Test will pass
		Assertions.assertSame(brandNameString, anotherBrandNameString);
		// Test will fail
		Assertions.assertSame(brandNameString, differentbrandNameString);
	}

	@Test
	public void testNotSame() {
		String brandNameValue = "Mercedes Benz";
		String anotherBrandNameString = "BMW";
		String differentName = "Mercedes Benz";
		// Test will fail
		Assertions.assertNotSame(brandNameValue, anotherBrandNameString);
		// Test will pass
		Assertions.assertNotSame(brandNameValue, differentName);
	}

	public void testArraysCase() {
		int[] firstArray = new int[] { 1, 2, 3 };
		int[] secondArray = new int[] { 2, 1, 3 };
		int[] thirdArray = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] fourthArray = new int[] { 1, 2, 3 };
		String testMessage = "Array Equality Test";

		// Test will pass
		Assertions.assertArrayEquals(firstArray, fourthArray, testMessage);

		// Test will fail because element order is different
		Assertions.assertArrayEquals(firstArray, secondArray, testMessage);

		// Test will fail because number of elements are different
		Assertions.assertArrayEquals(firstArray, thirdArray, testMessage);
	}

	@Test
	public void testSomeIterables() {
		Iterable<Integer> firstList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		Iterable<Integer> secondList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		Iterable<Integer> thirdList = new ArrayList<>(Arrays.asList(1, 2, 3));
		Iterable<Integer> fourthList = new ArrayList<>(Arrays.asList(1, 2, 4, 3));

		// Test will pass
		Assertions.assertIterableEquals(firstList, secondList);

		// Test will fail
		Assertions.assertIterableEquals(firstList, thirdList);

		// Test will fail
		Assertions.assertIterableEquals(firstList, fourthList);
	}

	@Test
	public void itShouldThrowNullPointerExceptionWhenAnyThing() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			// do whatever you want to do here
			// ex :
			// objectName.thisMethodShoulThrowNullPointerExceptionForNullParameter(null);
		});
	}

	@Test
	void testTimeoutAndPreamptive() {

		// This will pass
		Assertions.assertTimeout(Duration.ofMinutes(1), () -> {
			return "result";
		});

		// This will fail
		Assertions.assertTimeout(Duration.ofMillis(100), () -> {
			Thread.sleep(200);
			return "result";
		});

		// This will fail
		Assertions.assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
			Thread.sleep(200);
			return "result";
		});
	}

	@Test
	void testFailing() {

		Assertions.fail("Fail anyway");
	}
}
