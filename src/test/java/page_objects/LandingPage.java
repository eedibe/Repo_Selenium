package page_objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test_scripts.VerifyDuplicates;

import java.util.Calendar;

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

    //not working not sure what I am not improting
 /*   public void duplicateElemnts(){
      VerifyDuplicateValue(selectMonth);*/

    }

