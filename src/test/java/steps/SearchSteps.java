package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.SearchPage;
import pages.SearchResultPage;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class SearchSteps {
    private SearchPage searchPage = new SearchPage();
    private WebDriver driver;

    public SearchResultSteps executeSearchByKeywords (String keywords) throws InterruptedException {
        searchPage.fillSearchField(keywords);
//        driver.wait();
        searchPage.pressKey();
        Thread.sleep(3000);
        return new SearchResultSteps();
    }
}

