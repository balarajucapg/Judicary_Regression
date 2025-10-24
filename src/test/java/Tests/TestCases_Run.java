package Tests;
import BaseTest.Base;
import Pages.ICA_Create_Case;
import Pages.JEFSCaseCreationFC;
import Pages.JEFS_Login;
import Pages.Utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static BaseTest.Base.commonproperties;
import static Pages.Utilities.takeScreenshot;


public class TestCases_Run {

    public static WebDriver driver;
    public static Object ExcelUtils;
    static ExtentReports report;
    public static ExtentTest test;
    static ExtentReports extent = new ExtentReports();
    public static long startTime = System.currentTimeMillis();
    public static Properties commonproperties = new Properties();
    public static FileReader file;

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

    @BeforeSuite
    public static void setups() throws InterruptedException {

        String timestamp = new SimpleDateFormat("MMM_dd_yyyy_hh_mm_ss_a").format(new Date());
        ExtentSparkReporter spark_AllTestReport = new ExtentSparkReporter("reports/AllTestReport" +"_"+ timestamp + ".html");
        extent.setSystemInfo("Start Time", new SimpleDateFormat("HH:mm:ss").format(new Date(startTime)));
        extent.attachReporter(spark_AllTestReport);
    }

    @Test(priority = 1)
    void JEFS_Create_Case_AB() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_CreateFamilyCaseAB", "JEFS_CreateFamilyCaseAB");
           JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(1);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_AB");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_AB");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_AB Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_AB");
           // driver.close();
        }
    }
    @Test(priority = 2)
    void JEFS_Create_Case_AL() throws InterruptedException, IOException, ParseException {

        try {
            test = extent.createTest("JEFS_Create_Case_AL", "JEFS_Create_Case_AB");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(2);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_AL");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_AL");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_AL Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_AL");
            driver.close();
        }
    }
    @Test(priority = 3)
    void JEFS_Create_Case_AN() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_Create_Case_AN", "JEFS_Create_Case_AN");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(3);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_AN");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_AN");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_AN Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_AN");
            driver.close();
        }
    }
    @Test(priority = 4)
    void JEFS_Create_Case_CU() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_Create_Case_CU", "JEFS_Create_Case_CU");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(4);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_CU");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_CU");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_CU Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_CU");
            driver.close();
        }
    }
    @Test(priority = 5)
    void JEFS_Create_Case_DA() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_Create_Case_DA", "JEFS_Create_Case_DA");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(5);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_DA");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_DA");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_DA Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_DA");
            driver.close();
        }
    }
   // @Test(priority = 6)
    void JEFS_Create_Case_DV() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_Create_Case_DV", "JEFS_Create_Case_DV");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(6);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_DV");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_DV");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_DV Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_DV");
            driver.close();
        }
    }
    //@Test(priority = 7)
    void JEFS_Create_Case_FM() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_Create_Case_FM", "JEFS_Create_Case_FM");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(7);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_FM");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_DV");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_FM Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_FM");
            driver.close();
        }
    }
    //@Test(priority = 8)
    void JEFS_Create_Case_GD() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_Create_Case_GD", "JEFS_Create_Case_GD");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(8);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_GD");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_GD");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_GD Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_GD");
            driver.close();
        }
    }
   // @Test(priority = 9)
    void JEFS_Create_Case_GV() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_Create_Case_GV", "JEFS_Create_Case_GV");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(9);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_GV");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_GV");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_GV Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_GV");
            driver.close();
        }
    }
    //@Test(priority = 10)
    void JEFS_Create_Case_PA() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_Create_Case_PA", "JEFS_Create_Case_PA");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(10);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_PA");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_PA");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_PA Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_PA");
            driver.close();
        }
    }
    //@Test(priority = 11)
    void JEFS_Create_Case_TM() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_Create_Case_TM", "JEFS_Create_Case_TM");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(11);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_TM");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_TM");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_TM Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_TM");
            driver.close();
        }
    }
   // @Test(priority = 12)
    void JEFS_Create_Case_UF() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_Create_Case_UF", "JEFS_Create_Case_UF");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(12);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_UF");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_UF");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_UF Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_UF");
            driver.close();
        }
    }
    @Test(priority = 13)
    void JEFS_Create_Case_UJ() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_Create_Case_UJ", "JEFS_Create_Case_UJ");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(13);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_UJ");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_UJ");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_UJ Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_UJ");
            driver.close();
        }
    }
    @Test(priority = 14)
    void JEFS_Create_Case_EM() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_Create_Case_EM", "JEFS_Create_Case_EM");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(14);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_EM");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_EM");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_EM Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_EM");
            driver.close();
        }
    }
   // @Test(priority = 15)
    void JEFS_Create_Case_EP() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_Create_Case_EP", "JEFS_Create_Case_EP");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(15);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_EP");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_EP");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_EP Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_EP");
            driver.close();
        }
    }
   // @Test(priority = 16)
    void JEFS_Create_Case_FC() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_Create_Case_FC", "JEFS_Create_Case_FC");
            JEFS_Login.JEFS_LoginPage(driver);
            JEFSCaseCreationFC.JEFS_Family_Case_Creation(16);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_Create_Case_FC");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_Create_Case_FC");
            Thread.sleep(5000);
            Assert.fail("JEFS_Create_Case_FC Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_Create_Case_FC");
            driver.close();
        }
    }
    // @Test(priority = 17)
    void JEFS_CreateICAcaseAP() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_CreateICAcaseAP", "JEFS_CreateICAcaseAP");
            JEFS_Login.JEFS_LoginPage(driver);
            ICA_Create_Case.ICA_Create_CaseCreation(1);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_CreateICAcaseAP");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_CreateICAcaseAP");
            Thread.sleep(5000);
            Assert.fail("JEFS_CreateICAcaseAP Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_CreateICAcaseAP");
            driver.close();
        }
    }
    // @Test(priority = 18)
    void JEFS_CreateICAcaseOT() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_CreateICAcaseOT", "JEFS_CreateICAcaseOT");
            JEFS_Login.JEFS_LoginPage(driver);
            ICA_Create_Case.ICA_Create_CaseCreation(1);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_CreateICAcaseOT");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_CreateICAcaseOT");
            Thread.sleep(5000);
            Assert.fail("JEFS_CreateICAcaseOT Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_CreateICAcaseOT");
            driver.close();
        }
    }
    // @Test(priority = 19)
    void JEFS_CreateICAcaseST() throws InterruptedException, IOException, ParseException {
        try {
            test = extent.createTest("JEFS_CreateICAcaseST", "JEFS_CreateICAcaseST");
            JEFS_Login.JEFS_LoginPage(driver);
            ICA_Create_Case.ICA_Create_CaseCreation(1);
            boolean Home = driver.getPageSource().contains("Case ID");
            Assert.assertTrue(Home);
            test.pass("JEFS_CreateICAcaseST");
            Thread.sleep(5000);
        }catch (AssertionError | Exception e) {
            test.fail("JEFS_CreateICAcaseST");
            Thread.sleep(5000);
            Assert.fail("JEFS_CreateICAcaseST Test failed due to: " + e.getMessage()); // rethrow to mark test as failed
            throw e;
        } finally {
            takeScreenshot(driver, "JEFS_CreateICAcaseST");
            driver.close();
        }
    }

    @AfterSuite
    public static void CleanUp(){
        long endTime = System.currentTimeMillis();
        extent.setSystemInfo("End Time", new SimpleDateFormat("HH:mm:ss").format(new Date(endTime)));
        long durationMillis = endTime - startTime;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(durationMillis);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(durationMillis);
        String duration = String.format("%d min, %d sec", minutes, seconds % 60);
        extent.setSystemInfo("Duration", duration);
        extent.flush();

    }
}
