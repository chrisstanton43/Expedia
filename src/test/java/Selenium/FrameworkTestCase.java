package Selenium;

import cucumber.api.java.After;
import cucumber.api.java8.Fi;
import org.jboss.netty.channel.FileRegion;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.classes.SearchPageFactory;

import java.util.concurrent.TimeUnit;

public class FrameworkTestCase {
    private WebDriver driver;
    private String baseUrl;
    SearchPageFactory searchPage;

    @Before
    public void beforeClass(){

        driver= new FirefoxDriver();
        baseUrl="http://www.expedia.com/";
        searchPage= new SearchPageFactory(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    @Test
    public void test(){
        searchPage.clickFlightsTab();
        searchPage.setOriginCity("New York");
        searchPage.setDestinationCity("Hyderabad");
        searchPage.setDepartureDate("28/02/2017");
        searchPage.setReturnDate("25/03/2017");
        searchPage.clickOnSearchButton();

    }

    @After
    public void afterClass(){

    }


}
