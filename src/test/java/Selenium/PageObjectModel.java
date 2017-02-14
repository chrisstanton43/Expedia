package Selenium;

import cucumber.api.java.After;
import cucumber.api.java.cs.A;
import cucumber.api.java.eo.Se;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.classes.SearchPage;

import java.util.concurrent.TimeUnit;


public class PageObjectModel {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception{
        driver =new FirefoxDriver();
        baseUrl="http://www.expedia.com/";

        //Maximize the browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test(){
        driver.get(baseUrl);
        SearchPage.fillOriginTextBox(driver,"New York");
        SearchPage.destinationTextBox(driver).sendKeys("Hyderabad");
        SearchPage.departureDateTextBox(driver).sendKeys("28/02/2017");
        SearchPage.returnDateTextBox(driver).sendKeys("25/03/2017");
        SearchPage.clickOnSearchButton(driver);

    }
    @After
    public void tearDown() throws Exception{

    }
}
