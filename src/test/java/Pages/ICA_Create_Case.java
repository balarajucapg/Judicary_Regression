package Pages;

import Pages.JEFS_Login;
import Pages.ManageCases;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static Tests.TestCases_Run.driver;

public class ICA_Create_Case {
    public String Test = "False";
    public String CaseType = null;
    static String path = System.getProperty("user.dir") + "/testdata/JEFS_FCCaseCreation.xlsx";
    static String sheet = "Sheet1";
    public static String username = Utilities.getExcelCellData(path, sheet, 1, 1);

    //Page Objects
    public static String Create_Case = "//*[@id='j_idt12:0:j_idt17:0:j_idt20']/span/a";
    public static String Court_Type = "j_idt7:caseCourtType";
    public static String Case_Type = "j_idt7:caseType";
    public static String Submit = "//*[@id='j_idt7:Submit']";
    public static String Filing_Court = "caseInitBeanFormCivil:filingCourt";
    public static String NaturOfActions = "caseInitBeanFormCivil:civilNatureOfActionSelectItem";
    public static String MethodOfCaseInitiations = "caseInitBeanFormCivil:caseInitItems";
    public static String Issue = "caseInitBeanFormCivil:issueSelectItems";
    public static String TaxMapKeyNumber = "//*[@id='caseInitBeanFormCivil:civilTaxMapKeyNumber']";

    public static void ICA_Create_CaseCreation(int a) throws InterruptedException {
        String filePath = "C:\\Users\\balard\\OneDrive - Capgemini\\Desktop\\New folder\\SeleniumPractice\\Judicary_Regression\\testdataJEFS_ICACaseCreation.xlsx";
        String UserID = Utilities.getExcelCellData(path, sheet, a, 17);
        String Password = Utilities.getExcelCellData(path, sheet, a, 18);
        String ShortTitle = Utilities.getExcelCellData(path, sheet, a, 5);
        String ExtendCaseTitle = Utilities.getExcelCellData(path, sheet, a, 6);
        String Court_Type = Utilities.getExcelCellData(path, sheet, a, 1);
        String Case = Utilities.getExcelCellData(path, sheet, a, 2);
        String Court = Utilities.getExcelCellData(path, sheet, a, 0);

        Thread.sleep(5000);
        driver.findElement(By.xpath(Create_Case)).click();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);
        Select Court1 = new Select(driver.findElement(By.id(Court_Type)));
        Court1.selectByVisibleText(Court_Type);
        Thread.sleep(5000);
        Select CaseTye = new Select(driver.findElement(By.id(Case_Type)));
        CaseTye.selectByVisibleText(Case);
        Thread.sleep(5000);
        driver.findElement(By.xpath(Submit)).click();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);
        //Testing
    }
}
