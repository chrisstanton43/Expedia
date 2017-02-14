package IDEToWebDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class EasirentSeleniumTestcase {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.co.uk/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testEasirentSeleniumTestcase() throws Exception {
        driver.get(baseUrl + "/?gws_rd=ssl");
        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("easirent");
        driver.findElement(By.id("_fZl")).click();
        driver.findElement(By.linkText("Car Hire UK with Easirent - Cheap Car Hire")).click();
        driver.findElement(By.cssSelector("span.startIcon > span")).click();
        driver.findElement(By.id("AutoLocStart")).clear();
        driver.findElement(By.id("AutoLocStart")).sendKeys("newcastle");
        driver.findElement(By.xpath("//ul[@id='as_ul']/li/a/span[3]")).click();
        driver.findElement(By.xpath("//input[@value='Search!']")).click();
        driver.findElement(By.xpath("//input[@value='Book Now!']")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

//    private boolean isElementPresent(By by) {
//        try {
//            driver.findElement(by);
//            return true;
//        } catch (NoSuchElementException e) {
//            return false;
//        }
//    }

//    private boolean isAlertPresent() {
//        try {
//            driver.switchTo().alert();
//            return true;
//        } catch (NoAlertPresentException e) {
//            return false;
//        }
//    }
//
//    private String closeAlertAndGetItsText() {
//        try {
//            Alert alert = driver.switchTo().alert();
//            String alertText = alert.getText();
//            if (acceptNextAlert) {
//                alert.accept();
//            } else {
//                alert.dismiss();
//            }
//            return alertText;
//        } finally {
//            acceptNextAlert = true;
//        }
//    }
}

