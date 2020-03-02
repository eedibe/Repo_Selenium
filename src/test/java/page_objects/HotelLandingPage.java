package page_objects;

import org.openqa.selenium.By;
import test_scripts.DriverWrapper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelLandingPage  extends BasePage {
    private By popAlert = By.xpath("//button[@class='cta widget-overlay-close']");
    private By checkInField = By.xpath("//label[@id='widget-query-label-1']");
    private By checkOutField = By.xpath("//label[@id='widget-query-label-3']");
    private By backArrow = By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//button[1]");
    private By checkInDate = By.xpath("//div[6]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[2]");
    private By checkOutDate = By.xpath("//div[6]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/a[1]");

    public void popUpAlert() {
        clickOn(popAlert);
    }

    public void clickOnCheckInBox() {
        clickOn(checkInField);

    }
    public void checkInDATE(){clickOn(checkInDate);}
    public void clickCheckOutDate(){clickOn(checkOutDate);}
    public void clickOnBackArrow(){
        clickOn(backArrow);
    }

}

/***
 * 1. Check if alert displayed? if yes then click on X button
 *    (Hint: Look for alert X button locator)
 * 2. Get focused month locator and strip out the text
 *    - Get current month as display month format and store it as String data type
 *    - Compare currentMonth from system for focused month from web page
 *      (If they are not equal then click on back button (Find back button locator))
 */

