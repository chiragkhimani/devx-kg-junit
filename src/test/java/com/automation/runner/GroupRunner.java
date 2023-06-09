package com.automation.runner;


import com.automation.categories.SmokeTest;
import com.automation.testcases.CartPageTest;
import com.automation.testcases.LoginTest;
import com.automation.testcases.SearchFunctionalityTest;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({CartPageTest.class, LoginTest.class, SearchFunctionalityTest.class})
@Categories.ExcludeCategory(SmokeTest.class)
public class GroupRunner {

}
