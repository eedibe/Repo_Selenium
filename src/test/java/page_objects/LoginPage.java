package page_objects;

import org.openqa.selenium.By;

public class LoginPage extends page_objects.BasePage {

    //Locators
    private By loginError = By.xpath("//a[contains(text(),'Recover Your Account')]");
    private By loginPasswordError = By.xpath("//div[@class='_4rbf _53ij']");
    private By errorEmailCreateNewAcccout = By.xpath("//div[@id='reg_error_inner']");


    //Methods
    public String getErrorMessage() {
        return getValueFromElement(loginError);
    }
    public String getLoginPasswordErrorMessage(){
        return getValueFromElement(loginPasswordError);
    }
    public String getCreateNewAccountEmailError(){
        return getValueFromElement(errorEmailCreateNewAcccout);
    }
}
