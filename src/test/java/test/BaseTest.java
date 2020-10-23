package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import steps.SearchSteps;
import util.Browser;
import util.DriverFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    private static WebDriver driver;
    //private WebDriverWait wait = new WebDriverWait(driver,30);
    SearchSteps steps;
    public static WebDriver getDriver() {
        return driver;
    }
    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver(Browser.CHROME);
        driver.get("https://www.google.com");
       // wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='hplogo']")));
        steps = new SearchSteps();

    }
    @AfterMethod
    public void goBack(){
        driver.navigate().back();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
};
