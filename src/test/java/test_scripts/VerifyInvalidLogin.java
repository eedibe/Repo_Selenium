package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;
import page_objects.MessengerLoginFailPage;


public class VerifyInvalidLogin extends DriverWrapper {

        @Test
        public void verifyInvalidLogin() throws InterruptedException {
            LandingPage landingPage = new LandingPage();
            LoginPage loginPage = new LoginPage();
            MessengerLoginFailPage messengerPage = new MessengerLoginFailPage();

//        landingPage.enterEmail("mohammad@technosoft.io");
//        landingPage.enterPassword("test12345");
//        landingPage.clickLoginButton();
//        //Assertion
//        Assert.assertEquals("Recover your account", loginPage.getErrorMessage());
//
//        landingPage.enterFirstName("Test");
//        landingPage.enterLastName("test");
//        landingPage.enterMobileNumberOrEmail("8883338888");
//        landingPage.enterPassword("whatever");
//        landingPage.clickSignUp();
            //
        /*
Scenario #2
1. Launch "https://www.facebook.com"
2. Enter "abcd@test.com" as Email
3. Enter "test1234" as Password
4. Click on "Log In" button
5. Verify user gets "The password that you've entered is incorrect" message.
*/
            landingPage.enterEmail("abc@test.com");
            Thread.sleep(2000);
            landingPage.enterPassword("test1234");
            Thread.sleep(3000);
            landingPage.clickLoginButton();
            Thread.sleep(3000);
            Assert.assertEquals("The password you've entered is incorrect. Forgot Password?", loginPage.getLoginPasswordErrorMessage());










        }
    }


