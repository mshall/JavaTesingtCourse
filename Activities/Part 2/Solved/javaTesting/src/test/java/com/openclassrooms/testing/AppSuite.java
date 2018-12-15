package com.openclassrooms.testing;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(JUnitPlatform.class)
@SelectClasses({
	AppTest.class,
	AppExceptionTest.class
})
public class AppSuite {

}
