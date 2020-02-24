import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

       By firstName =  By.className("placeholder");
       WebElement signUpFirstname = driver.findElement(firstName);
       signUpFirstname.sendKeys();


    }



}
