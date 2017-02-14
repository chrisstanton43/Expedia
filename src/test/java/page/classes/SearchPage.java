package page.classes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public static WebElement element=null;

    /***
     * Returns the flight origin box element
     */
    public static WebElement originTextBox(WebDriver driver){
        element=driver.findElement(By.xpath(".//*[@id='package-origin-hp-package']"));
        return element;
    }

    public static void fillOriginTextBox(WebDriver driver, String origin){
        element=originTextBox(driver);
        element.sendKeys(origin);
    }
    /***
     * Returns the flight destination box element
     */

    public static WebElement destinationTextBox(WebDriver driver){
        element=driver.findElement(By.xpath(".//*[@id='package-destination-hp-package']"));
        return element;
    }
    /***
     * Returns the departure date text box element
     */
    public static WebElement departureDateTextBox(WebDriver driver){
        element=driver.findElement(By.xpath(".//*[@id='package-departing-hp-package']"));
        return element;
    }

    /***
     * Returns the return date text box element
     */
    public static WebElement returnDateTextBox(WebDriver driver){
        element=driver.findElement(By.xpath(".//*[@id='package-returning-hp-package']"));
        return element;
    }
    /***
     * Returns the search button text box element
     */
    public static WebElement searchButton(WebDriver driver){
        element=driver.findElement(By.xpath(".//*[@id='gcw-packages-form-hp-package']/div[11]/label/button"));
        return element;
    }
    /***
     *  Click on search button
     */
    public static void clickOnSearchButton(WebDriver driver){
        element=searchButton(driver);
        element.click();
    }

    /***
     * Navigate to flights tab
     */
    public static WebElement navigateToFlightsTab(WebDriver driver){
        driver.findElement(By.id("header-history")).click();
        element=driver.findElement(By.id("tab-flight-tab"));
        return element;
    }

}
