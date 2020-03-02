package page_objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test_scripts.DriverWrapper;
import test_scripts.VerifyDuplicates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LandingPage extends BasePage {

    //Locators
    private By emailTextField = By.id("email");
    private By passTextField = By.id("pass");
    private By loginButton = By.id("loginbutton");
    private By firstName = By.name("firstname");
    private By lastName = By.name("lastname");
    private By mobileNumOrEmail = By.xpath("//input[@aria-label='Mobile number or email']");
    private By newPassword = By.xpath("//input[@autocomplete = 'new-password']");
    private By signUp = By.name("websubmit");
    private By clickonMessengerLink = By.linkText("Messenger");
    private By selectMonth = By.id("month");
    private By redErrorMessage=By.xpath("//div[@id='u_0_q']");

    //amazon locators
    private By  priceCheck = By.xpath("//div[@class='sg-col-inner']//div/descendant::div[@class='a-row']");
    private By searchItem = By.id("twotabsearchtextbox");
    private By amazonSubmit = By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
    private String price = DriverWrapper.getDriver().findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS " +
            "template=SEARCH_RESULTS widgetId=search-results index=0']//span[@class='a-price']")).getText();
    private String amazonDate = DriverWrapper.getDriver().findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS " +
            "template=SEARCH_RESULTS widgetId=search-results index=0']//div[@class='rush-component']" +
            "//div[@class='rush-component']//div[@class='s-include-content-margin s-border-bottom']" +
            "//div[@class='a-section a-spacing-medium']//div[@class='sg-row']" +
            "//div[@class='sg-col-4-of-12 sg-col-8-of-16 sg-col-16-of-24 sg-col-12-of-20 sg-col-24-of-32 sg-col sg-col-28-of-36 sg-col-20-of-28']" +
            "//div[@class='sg-col-inner']//div[@class='sg-row']//div[@class='sg-col-4-of-24 sg-col-4-of-12 sg-col-4-of-36 sg-col-4-of-28 sg-col-4-of-16 sg-col sg-col-4-of-20 sg-col-4-of-32']//div[@class='sg-col-inner']//div[@class='a-section a-spacing-none a-spacing-top-micro']//div[@class='a-row a-size-base a-color-secondary s-align-children-center']//div[@class='a-row s-align-children-center']//span//span[@class='a-text-bold'][contains(text(),'Tomorrow, Feb 28')]")).getText();




    //Methods
    public void enterEmail(String value){
        setValue(emailTextField, value);
    }

    public void enterPassword(String value) {
        setValue(passTextField, value);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }
    public void enterFirstName(String value){
        setValue(firstName,value);

    }
    public void enterLastName(String value){
        setValue(lastName, value);
    }
    public void enterMobileNumberOrEmail(String value){
        setValue(mobileNumOrEmail, value);
    }

    public void clearMobileNumberOrEmail(){
        clearValue(mobileNumOrEmail);
    }

    public void enterNewPassword(String value){
        setValue(newPassword, value);
    }
    public void clickSignUp(){
        clickOn(signUp);
    }

    public void clickonMessengerLink(){
        clickOn(clickonMessengerLink);

    }
    public void cliconRedErrorMessage(){
        clickOn(redErrorMessage);
    }
    public boolean isLoginButtonDispalyed(){
        return isElementDisplayed(loginButton);
    }


//    public void selectCurrentMonth() {
//        Calendar now = Calendar.getInstance();
//        now.get(Calendar.MONTH);
//    }
    public void selectCurrentMonth(){
        clickOn(selectMonth);
    }

    public void verifyDuplicateMonth(){
        verifyDuplicate(selectMonth);


    }
//    public void priceCheckRange(double lowPrice, double higherPrice){
//        if ((locator > lowPrice) && (locator <= higherPrice) ) {
//            System.out.println("Price range is between " + lowPrice + " and " + higherPrice);
//            else
//            System.out.println("Price out of range");
//
//        }
//    }
 /*****************Amazon***********************************/


 public void setItemforSearch(String item){
        setValue(searchItem, item);
    }

    public void getElementPrice(double minPrice, double maxPrice){

        String strPrice = price.substring(1,4);
        double fullPrice= Double.parseDouble(strPrice);
        if(fullPrice  >= minPrice && fullPrice <= maxPrice){
            System.out.println("Price is between $50 and $150");
        }else{
            System.out.println("rice is out of the range");
        }

    }
    public void clickonSearch(){
        clickOn(amazonSubmit);
    }
    public void getDates(){
        String result = amazonDate.substring(10,16);
        Date date = new Date();
        SimpleDateFormat datetoString = new SimpleDateFormat("MMM dd");
        System.out.println("Current date : " + datetoString.format(date));
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd");
        Date date1 = null;
        try {
            date1 = formatter.parse(result);
        }
        catch(Exception ex){
            System.out.println("exception:" + ex);
        }
        if(date1.compareTo(date)<0){
            System.out.println("Amazon date is greater than today's date");
        }else{
            System.out.println("Amazon date is not greater than today's date");
        }
    }

    }









