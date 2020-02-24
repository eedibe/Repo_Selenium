package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.MessengerLoginFailPage;

public class VerifyBlankMessengerSignInError extends DriverWrapper {

          /*Scenario #3
            1. Launch "https://www.facebook.com"
            2. Click on "Messenger" link
            3. Click on "Sign In" button
          4. Verify user gets "Incorrect email address or phone number" message
        */
          MessengerLoginFailPage messengerPage = new MessengerLoginFailPage();
          LandingPage landingPage = new LandingPage();

    @Test
    public void verifyInvalidMessengerLogin() {

        landingPage.clickonMessengerLink();
        messengerPage.clickonSignIn();
        messengerPage.getUserErrorMessage();
        String expErrorMsg = "Incorrect email address or phone number";
        Assert.assertEquals(expErrorMsg, messengerPage.getUserErrorMessage(), "Error message is not as expected");

    }

}


