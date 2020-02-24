package test_scripts;



import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VerifyEmailList extends DriverWrapper {



@Test
    public void VerifEmailList() throws InterruptedException {

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(
                " .abc..@example.com",
                "  @example.com",
                "  Joe Smith <email@example.com>",
                "  email.example.com",
                "  email@example@example.com",
                "  .email@example.com",
                "  email.@example.com",
                "  email..email@example.com",
                "  あいうえお@example.com"
                , "  email@example.com (Joe Smith)",
                "  email@example",
                "  email@-example.com",
                "  email@example.web",
                "  email@111.222.333.44444",
                "  email@example..com",
                "  Abc..123@example.com"));

         for(int i = 0; i<arrayList.size(); i++){
             LandingPage landingPage = new LandingPage();
          //   landingPage.enterFirstName("eva");
            //landingPage.enterLastName("Testvalue");
             System.out.println(arrayList.get(i));
             landingPage.clearMobileNumberOrEmail();
             landingPage.enterMobileNumberOrEmail(arrayList.get(i));
             Thread.sleep(3000);

             landingPage.clickSignUp();


        }

    }
}
