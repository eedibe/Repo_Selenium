package test_scripts;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.HotelLandingPage;
import page_objects.LandingPage;
import page_objects.LoginPage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class SelectTomorrowsDate_AddSevenDays extends DriverWrapper {

   @Test
        public void VerifySelectTomorrowsDatePlusSevenDays() throws InterruptedException{
            HotelLandingPage hotlanding = new HotelLandingPage();

            HotelLandingPage landingPage = new HotelLandingPage();
           // landingPage.popUpAlert();
            Thread.sleep(3000);
            landingPage.clickOnCheckInBox();
            Thread.sleep(3000);


            DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            cal.add(Calendar.DATE, 1);
            String newDate = sdf.format(cal.getTime());
            System.out.println("Check-in date, is tomorrow's date " + newDate);
            //click on calender icon first one
            getDriver().findElement(By.id("widget-query-label-1")).click();
            Thread.sleep(3000);

            // check-in date
            getDriver().findElement(By.xpath("//div[6]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
            //System.out.println(checkInDate);
            Thread.sleep(3000);
            //click on calendar icon for checkout
            getDriver().findElement(By.id("widget-query-label-3")).click();
            //check-out date
            getDriver().findElement(By.xpath("//div[6]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[3]/a[1]")).click();
            // System.out.println(checkOutDate);
           String BlackBriefCase = getDriver().findElement(By.id("qf-0q-nights")).getText();

            System.out.println("Stay - in forfollowing nights :" + BlackBriefCase);
            Assert.assertEquals(BlackBriefCase, "7");
            Thread.sleep(3000);


    }

}
