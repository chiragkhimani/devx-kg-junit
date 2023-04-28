package com.automation.runner;


import com.automation.testcases.CartPageTest;
import com.automation.testcases.LoginTest;
import com.automation.testcases.SearchFunctionalityTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CartPageTest.class, LoginTest.class, SearchFunctionalityTest.class})
public class TestRunner {

}
