package com.codedivers.testing.selenium;

import java.util.List;

public class TestCase {

	List<TestStep> testSteps;

	public void addTestStep(TestStep testStep) {
		testSteps.add(testStep);
	}

	public List<TestStep> getTestStepsList() {
		return testSteps;
	}

}
