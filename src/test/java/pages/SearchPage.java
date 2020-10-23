package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    @FindBy(name="q")
    private WebElement searchField;

    @FindBy(xpath="//div[@class='FPdoLc tfB0Bf']//input[@name='btnK'][@class='gNO89b'][@type='submit']")
    public WebElement searchButton;

    public SearchPage(){
        super(); //создали конструктов SearchPage, который обращается к конструктору BasePage
    }

    public void fillSearchField(String text){
        searchField.click();
        searchField.sendKeys(text);
    }
    public void pressKey(){
        searchField.sendKeys(Keys.RETURN);
    }

}



//package pages;
//
//import org.openqa.selenium.WebDriver;
//
//public class SearchPage extends BasePage {
//    WebDriver driver;
//    public SearchPage(){
//        super();
//
//    }}
