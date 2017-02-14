package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by subbu on 14/02/2017.
 */
public class SearchPageFactory {

    WebDriver driver;

    @FindBy(id="header-history")
    WebElement headerHistory;

    @FindBy(xpath=".//*[@id='tab-flight-tab-hp']")
    WebElement flightsTab;

    @FindBy(id="flight-origin-hp-flight")
    WebElement originCity;

    @FindBy(id="flight-destination-hp-flight")
    WebElement destinationCity;

    @FindBy(id="flight-departing-hp-flight")
    WebElement departureDate;

    @FindBy(id="flight-returning-hp-flight")
    WebElement returnDate;

    @FindBy(xpath=".//*[@id='gcw-flights-form-hp-flight']/div[7]/label/button")
    WebElement searchButton;



    @FindBy(id="flight-type-roundtrip-label-hp-flight")
    WebElement roundTrip;

    @FindBy(id="flight-type-multi-dest-label-hp-flight")
    WebElement multipleDestination;


    public SearchPageFactory(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFlightsTab(){
        headerHistory.click();
        flightsTab.click();
    }
    public void setOriginCity(String origin){
        originCity.sendKeys(origin);
    }
    public void setDestinationCity(String destination){
        destinationCity.sendKeys(destination);
    }

    public void setDepartureDate(String date){
        departureDate.sendKeys(date);
    }
    public void setReturnDate(String date){
        returnDate.sendKeys(date);
    }
    public void clickOnSearchButton(){
        searchButton.click();
    }


//    public void clickroundTrip(){
//        roundTrip.click();
//    }
//    public void clickMultipleDestination(){
//        multipleDestination.click();
//    }

}

