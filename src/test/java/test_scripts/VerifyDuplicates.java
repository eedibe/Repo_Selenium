package test_scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import page_objects.LandingPage;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Set;


public class VerifyDuplicates extends DriverWrapper {
    @Test
    public void VerifyDuplicate() {
        LandingPage landingPage = new LandingPage();
        landingPage.verifyDuplicateMonth();
    }
}







