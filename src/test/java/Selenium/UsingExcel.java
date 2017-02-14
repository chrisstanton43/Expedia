package Selenium;

import org.apache.bcel.Constants;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by subbu on 14/02/2017.
 */
public class UsingExcel {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception{
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test()throws Exception{
        driver.get(Constants.URL);
        driver.findElement(By.id("header-history"));

    }


}
