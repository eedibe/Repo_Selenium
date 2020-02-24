package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

public class verifyErrorMessageDuringSingupForm extends DriverWrapper {

    @Test
    public void verifyErrorMessage() throws InterruptedException{
        LandingPage landingPage = new LandingPage();
        LoginPage logingPage = new LoginPage();

        landingPage.enterFirstName("Ewa");
        Thread.sleep(2000);
        landingPage.enterLastName("Tesla");
        Thread.sleep(2000);
        landingPage.enterMobileNumberOrEmail("if.1212@example.co");
        Thread.sleep(2000);
        landingPage.enterPassword("test12345");
        Thread.sleep(2000);
        landingPage.clickSignUp();
        Thread.sleep(2000);
        landingPage.cliconRedErrorMessage();
        Thread.sleep(2000);
        Assert.assertEquals("Please enter a valid mobile or email address",logingPage.getCreateNewAccountEmailError());


    }

}
