package com.codedivers.testing.selenium;

import java.util.List;

public class TestSuite {

	List<TestCase> testCases;

	public void addTestStep(TestCase testCase) {
		testCases.add(testCase);
	}

	public List<TestCase> getTestCasesList() {
		return testCases;
	}

}
