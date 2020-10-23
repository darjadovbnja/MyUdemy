package test;

import org.testng.annotations.Test;
import pages.SearchPage;
import pages.SearchResultPage;

public class SearchTest extends BaseTest {
    public SearchTest() {
        super();
    }
    @Test
    public void searchInChrome() throws InterruptedException {
        steps.executeSearchByKeywords("selenium").
                verifyThatResultContainsProperText("selenium").
                verifyThatResultContainsProperAttribute("aCOpRe");
    }

};

