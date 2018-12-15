package com.openclassrooms.testing;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class AppExceptionTest {

	@Test
	public void givenNullValueWhenNPEThrownThenAssertionSucceeds() {
		// This string variable is only null
		App app = null;
		assertThrows(NullPointerException.class, () -> {
			app.generateRandomString();
		});
	}

	@Test
	public void givenThenException() {
		assertThrows(NumberFormatException.class, () -> {
			String fakeNumberString = "";
			int fakeNumber = Integer.parseInt(fakeNumberString);
		});
	}

}
