package com.automation.testcases;

import com.automation.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SearchFunctionalityTest extends BaseTest {

    @Test
    @Category(SmokeTest.class)
    public void verifySearchResultsAreDisplayed() {
        System.out.println("verify search result");
    }

    @Test
    public void verifyMessageWhenThereAreNoResult() {
        System.out.println("verify no result message");
    }

    @Test
    public void verifySearchResultHasSearchKeyword() {
        System.out.println("verify search result has search keyword");
    }
}
