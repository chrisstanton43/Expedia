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
        element=driver.findElement(By.id("flight-origin"));
        return element;
    }
    /***
     *
     */
}
