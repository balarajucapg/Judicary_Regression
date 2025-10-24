package BaseTest;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

    public class Base {
        public static WebDriver driver;
        public static Properties commonproperties = new Properties();
        public static FileReader file;
        public static Object ExcelUtils;
        static ExtentReports report;
        public static ExtentTest test;
        public static ExtentReports extent = new ExtentReports();
        public static long startTime = System.currentTimeMillis();


        @BeforeMethod
        public static void setUp() throws IOException {

            if (driver == null) {
                file = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
                commonproperties.load(file);

            }
            if (commonproperties.getProperty("browser").equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

                driver.get(commonproperties.getProperty("url"));
            } else if (commonproperties.getProperty("browser").equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.get(commonproperties.getProperty("url"));
            }

        }


        @AfterMethod
        public static void tearDown (){
           if (driver != null) {
               driver.quit();

            System.out.println("Browser closed successfully");
            }

        }

    }




