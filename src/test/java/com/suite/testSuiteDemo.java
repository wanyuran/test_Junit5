package com.suite;

import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.testcases"})
@IncludePackages({"com.testcases.testcase","com.testcases.testcase1"})
public class testSuiteDemo {
}
