package Tests;
import Pages.JEFS_Login;
import Pages.ManageCases;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static Pages.ManageCases.Result_Table_FirstCase;
import static Pages.Utilities.takeScreenshot;
import static Tests.TestCases_Run.driver;

public class JEFS_ManageCases {
    public static Object ExcelUtils;
    static ExtentReports report;
    public static ExtentTest test;
    static ExtentReports extent = new ExtentReports();


    @BeforeSuite
    public static void setup() throws InterruptedException {
        ExtentSparkReporter spark_AllTestReport = new ExtentSparkReporter("reports/JEFS_ManageCases.html");
        extent.attachReporter(spark_AllTestReport);

    }

    @Test
    void ManageCases_MyCase_Search() throws InterruptedException {
        test = extent.createTest("ManageCases_MyCase_Search", "ManageCases_MyCase_Search");
        JEFS_Login.JEFS_LoginPage(driver);
        ManageCases.MyCaseSearch();
        String CaseId = driver.findElement(By.xpath(Result_Table_FirstCase)).getText();
        String CaseId1 = "1FDV-25-0001922";
        if (CaseId1.equals(CaseId)){
            test.pass("ManageCases_MyCase_Search");
            takeScreenshot(driver, "ManageCases_MyCase_Search");
            Thread.sleep(5000);
            driver.close();
        }else {
            test.fail("ManageCases_MyCase_Search");
            takeScreenshot(driver, "ManageCases_MyCase_Search");
            Thread.sleep(5000);
            driver.close();
            Assert.fail("Failing this test due to data mismatch");
        }

    }
    @Test
    void  ManageCases_MyDocuments_Search() throws InterruptedException {
        test = extent.createTest("ManageCases_MyDocuments_Search", "ManageCases_MyDocuments_Search");
        JEFS_Login.JEFS_LoginPage(driver);
        ManageCases.MyDocumentsSearch();
        String CaseId = driver.findElement(By.xpath(Result_Table_FirstCase)).getText();
        String CaseId1 = "1FDV-25-0001922";
        if (CaseId1.equals(CaseId)){
            test.pass("ManageCases_MyDocuments_Search");
            takeScreenshot(driver, "ManageCases_MyDocuments_Search");
            Thread.sleep(5000);
            driver.close();
        }else {
            test.fail("ManageCases_MyDocuments_Search");
            takeScreenshot(driver, "ManageCases_MyDocuments_Search");
            Thread.sleep(5000);
            driver.close();
            Assert.fail("Failing this test due to data mismatch");
        }

    }
    @Test
    void  ManageCases_AllFirmCases_Search() throws InterruptedException {
        test = extent.createTest("ManageCases_AllFirmCases_Search", "ManageCases_AllFirmCases_Search");
        JEFS_Login.JEFS_LoginPage(driver);
        ManageCases.MyDocumentsSearch();
        String CaseId = driver.findElement(By.xpath(Result_Table_FirstCase)).getText();
        String CaseId1 = "1FDV-25-0001922";
        if (CaseId1.equals(CaseId)){
            test.pass("ManageCases_AllFirmCases_Search");
            takeScreenshot(driver, "ManageCases_AllFirmCases_Search");
            Thread.sleep(5000);
            driver.close();
        }else {
            test.fail("ManageCases_AllFirmCases_Search");
            takeScreenshot(driver, "ManageCases_AllFirmCases_Search");
            Thread.sleep(5000);
            driver.close();
            Assert.fail("Failing this test due to data mismatch");
        }

    }
    @Test
    void  ManageCases_AllFirmDocuments_Search() throws InterruptedException {
        test = extent.createTest("ManageCases_AllFirmDocuments_Search", "ManageCases_AllFirmDocuments_Search");
        JEFS_Login.JEFS_LoginPage(driver);
        ManageCases.MyDocumentsSearch();
        String CaseId = driver.findElement(By.xpath(Result_Table_FirstCase)).getText();
        String CaseId1 = "1FDV-25-0001922";
        if (CaseId1.equals(CaseId)){
            test.pass("ManageCases_AllFirmDocuments_Search");
            takeScreenshot(driver, "ManageCases_AllFirmDocuments_Search");
            Thread.sleep(5000);
            driver.close();
        }else {
            test.fail("ManageCases_AllFirmDocuments_Search");
            takeScreenshot(driver, "ManageCases_AllFirmDocuments_Search");
            Thread.sleep(5000);
            driver.close();
            Assert.fail("Failing this test due to data mismatch");
        }

    }
    @AfterSuite
    public static void CleanUp(){
        extent.flush();

    }
}
