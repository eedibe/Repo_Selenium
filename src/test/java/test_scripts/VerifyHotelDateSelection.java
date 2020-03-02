package test_scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page_objects.BasePage;
import page_objects.HotelLandingPage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

public class VerifyHotelDateSelection extends DriverWrapper {

    @Test
    public void getCurrentMonth() throws InterruptedException{
        BasePage basePage = new BasePage();
        HotelLandingPage landingPage= new HotelLandingPage();
        Thread.sleep(5000);
        landingPage.popUpAlert();
        Thread.sleep(5000);


        getDriver().findElement(By.id("widget-query-label-1")).click();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
        Date date = new Date();
        String today = sdf.format(date);
        System.out.println("Current month : " + today);
        Thread.sleep(3000);

        String month =  getDriver().findElement(By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible " +
                                                            "widget-daterange-below']//div[1]//div[1]//div[1]")).getText();

        System.out.println("Display month: " + month);

        if(!(today.equals(month))){
            System.out.println("Months are not equal ");
        }else{
            System.out.println("Months are equal ");

        }

//        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(new Date());
//        cal.add(Calendar.DATE, 7);
//        Thread.sleep(3000);
//        String newDate = dateFormat.format(cal.getTime());
//
//        System.out.println("Next day " + newDate);


    }

    }




