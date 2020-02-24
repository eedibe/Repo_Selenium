package test_scripts;

import org.testng.annotations.Test;
import page_objects.BasePage;
import page_objects.LandingPage;


public class VerifyCurrentMonth extends DriverWrapper {

    @Test
    public void verifyCurrentMonth() throws InterruptedException {

        LandingPage landingPage = new LandingPage();
        landingPage.selectCurrentMonth();
        Thread.sleep(3000);


    }


}
