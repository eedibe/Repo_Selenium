package test_scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page_objects.BasePage;
import page_objects.LandingPage;


public class verifyAmazoniPhone extends DriverWrapper {

  @Test
    public void verifyPriceRange() throws InterruptedException{
        BasePage basePage = new BasePage();
        LandingPage landingPage = new LandingPage();


        landingPage.setItemforSearch("iPhone");
        landingPage.clickonSearch();
        Thread.sleep(2000);
        landingPage.getElementPrice(50.00,150.00);


        landingPage.getDates();


    }

}
