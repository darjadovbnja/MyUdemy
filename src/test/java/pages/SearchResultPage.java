package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultPage extends BasePage {
    @FindBy(xpath = "//*[@id='rso']/div[1]/div/div[2]/div/span")
    private WebElement resultRow;

    public SearchResultPage(){
        super();
    }
    public void assertThatResultContainsProperText(String expectedText){
        assertThat(resultRow.isDisplayed()).as("no such a result").isTrue();
        assertThat(resultRow.getText()).as("there is no such text").containsIgnoringCase(expectedText);
    }
    public void assertThatResultContainsProperAttribute(String expectedAttribute){
        assertThat(resultRow.getAttribute("class")).as("class name is unexpected").containsIgnoringCase(expectedAttribute);
    }
    }


