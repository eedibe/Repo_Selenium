package page_objects;

import org.openqa.selenium.By;

public class MessengerLoginFailPage extends BasePage {

    private By signInMessenger = By.id("loginbutton");
    private By userErrorMessage =  By.xpath("//div[contains(text(),'Incorrect email or phone number')]");
    private By emailorPhoneNumber = By.xpath("//input[@id = 'email']");
    private By password = By.xpath("//input[@type='password']");
  //  private By blankSignInError = By.xpath("//div[starts-with(text(),'Incorrect email')]");




    public void clickonSignIn(){
        clickOn(signInMessenger);
    }
    public String getUserErrorMessage(){
        return getValueFromElement(userErrorMessage);

    }
    public void setEmailorPhoneNumber(String value) {
        setValue(emailorPhoneNumber, value);
    }
    public void setPassword(String value){
        setValue(password,value);
    }

   // public String getBlankSignInError() {
      //  return getValueFromElement(blankSignInError);
   // }

}

