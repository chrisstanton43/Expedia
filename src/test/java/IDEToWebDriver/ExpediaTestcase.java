package IDEToWebDriver;

import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpediaTestcase {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.expedia.co.uk/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testExpediaTestcase() throws Exception {
        driver.get(baseUrl);
        Thread.sleep(2000);
        WebElement text=driver.findElement(By.id("flight-departing"));
        text.click();

        WebElement cal=driver.findElement(By.xpath("//div[@class='cal]//section[1]//ul[@class='cal-dates'"));
        List<WebElement> columns= cal.findElements(By.tagName("li"));
        for(WebElement cell:columns)
        {
            if(cell.getText().equals("30"))
            {
            cell.findElement(By.linkText("30")).click();
            }
        }


    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }


}
