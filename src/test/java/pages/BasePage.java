package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static test.BaseTest.getDriver;

public abstract class BasePage{
    WebDriver driver;
    public BasePage(){
        this.driver=getDriver();
        PageFactory.initElements(driver, this);

    }

}








//package pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//import test.BaseTest;
//
//import static test.BaseTest.getDriver;
//
//public abstract class BasePage{
//    WebDriver driver;
//    public BasePage(){
//        this.driver=getDriver();
//        PageFactory.initElements(driver, this);
//    }
//}

