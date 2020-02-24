package page_objects;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;

import test_scripts.DriverWrapper;
import org.openqa.selenium.WebElement;

import java.util.Calendar;
import java.util.Date;
import java.util.*;


public class BasePage {

    public void clickOn(By locator) {
        DriverWrapper.getDriver().findElement(locator).click();
    }

    public void setValue(By locator, String value) {
        DriverWrapper.getDriver().findElement(locator).sendKeys(value);
    }

    public void clearValue(By locator) {
        DriverWrapper.getDriver().findElement(locator).clear();
    }

    public String getValueFromElement(By locator) {
        return DriverWrapper.getDriver().findElement(locator).getText();
    }

    public boolean isElementDisplayed(By locator) {
        boolean isDisplayed;
        try {
            isDisplayed = DriverWrapper.getDriver().findElement(locator).isDisplayed();
        } catch (
                NoSuchElementException e) {
            isDisplayed = false;
        }
        return isDisplayed;
    }

    public boolean isElementSelected(By locator){
        boolean isSelected = DriverWrapper.getDriver().findElement(locator).isSelected();

        return isSelected;

 }
    public boolean isElementEnabled(By locator){
        boolean isEnabled = DriverWrapper.getDriver().findElement(locator).isEnabled();
        return isEnabled;

 }
    public void selectElementByText(By locator) {
        Select select = new Select(DriverWrapper.getDriver().findElement(locator));
        List<WebElement> list = select.selectByValue();
    }
    public void selectElementByIndex(By locator) {
        Select select = new Select(DriverWrapper.getDriver().findElement(locator));
        List<WebElement> list = select.selectByIndex();
    }

    // Select selectText = new Select(DriverWrapper.getDriver().findElement(locator).

    public void verifyDuplicate (By locator){
        Select select = new Select(DriverWrapper.getDriver().findElement(locator));
        List<WebElement> list = select.getOptions();
        Set<String> listNames = new HashSet<String>(list.size());
        for (WebElement element : list) {
            if(listNames.contains(element.getText())==true){
                System.out.println("Duplicate value is: "+element);
            }
            else{
                listNames.add(element.getText());
            }
        }
    }

   }

