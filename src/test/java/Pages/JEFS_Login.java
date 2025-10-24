package Pages;

import BaseTest.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JEFS_Login {
   // public static WebDriver driver;
    public static String User_ID = "//*[@id=\"j_idt7:userID\"]";
    public static String Password = "//*[@id=\"j_idt7:password\"]";
    public static String Login = "//*[@id=\"j_idt7:j_idt47\"]";

    public static void JEFS_LoginPage(WebDriver driver) throws InterruptedException {
        driver.manage().window().maximize();
        driver.findElement(By.xpath(User_ID)).sendKeys("WEBU1482");
        driver.findElement(By.xpath(Password)).sendKeys("test123");
        driver.findElement(By.xpath(Login)).click();
        Thread.sleep(5000);
    }
}
