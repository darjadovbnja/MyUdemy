package steps;

import pages.SearchResultPage;

public class SearchResultSteps {

    private SearchResultPage searchResultPage = new SearchResultPage();

    public SearchResultSteps verifyThatResultContainsProperText(String text) {
        searchResultPage.assertThatResultContainsProperText(text);
        return this;
    }

    public SearchResultSteps verifyThatResultContainsProperAttribute(String text){
        searchResultPage.assertThatResultContainsProperAttribute(text); //("aCOpRe");
        return this;
    }

}
