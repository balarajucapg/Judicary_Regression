package Pages;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import static Tests.TestCases_Run.driver;
import static Tests.TestCases_Run.*;


public class ManageCases {
    static String path = System.getProperty("user.dir") + "/testdata/JEFS_ManageCases.xlsx";
    static String sheet = "Sheet1";

   public static String username = Utilities.getExcelCellData(path, sheet, 1, 1);




    public static String ManageCases_Link = "//*[@id=\"j_idt12:1:j_idt17:0:j_idt20\"]/span/a";
    public static String MyCases_Radio = "//*[@id=\"manageCaseform:j_idt16\"]/table/tbody/tr/td[1]/label";
    public static String Case_ID_Text = "//*[@id=\"manageCaseform:caseID\"]";
    public static String Search_Button = "//*[@id=\"manageCaseform:manageCaseSearchButtonFilter\"]";
    public static String Result_Table_FirstCase = "//*[@id=\"manageCaseform:activeCasesTable_row_0\"]/td[1]";
    public static String Home = "//*[@id=\"manageCaseform\"]/div[2]/div[2]/span[2]/a";


    public static void MyCaseSearch() throws InterruptedException {
        driver.findElement(By.xpath(ManageCases_Link)).click();
        driver.findElement(By.xpath(MyCases_Radio)).click();
        driver.findElement(By.xpath(Case_ID_Text)).sendKeys(username);
        driver.findElement(By.xpath(Search_Button)).click();
        Thread.sleep(8000);

    }
    
    public static void MyDocumentsSearch() throws InterruptedException {
        driver.findElement(By.xpath(ManageCases_Link)).click();
        driver.findElement(By.xpath(MyCases_Radio)).click();
        driver.findElement(By.xpath(Case_ID_Text)).sendKeys("1FDV-25-1922");
        driver.findElement(By.xpath(Search_Button)).click();
        Thread.sleep(5000);

    }
    public static void MyFirmCaseSearch() throws InterruptedException {
        driver.findElement(By.xpath(ManageCases_Link)).click();
        driver.findElement(By.xpath(MyCases_Radio)).click();
        driver.findElement(By.xpath(Case_ID_Text)).sendKeys("1FDV-25-1922");
        driver.findElement(By.xpath(Search_Button)).click();
        Thread.sleep(5000);

    }
    public static void MyFirmDocumentsSearch() throws InterruptedException {
        driver.findElement(By.xpath(ManageCases_Link)).click();
        driver.findElement(By.xpath(MyCases_Radio)).click();
        driver.findElement(By.xpath(Case_ID_Text)).sendKeys("1FDV-25-1922");
        driver.findElement(By.xpath(Search_Button)).click();
        Thread.sleep(5000);

    }
    public static void Verify_Result_Table() throws InterruptedException {
        Thread.sleep(5000);
       String CaseId = driver.findElement(By.xpath(Result_Table_FirstCase)).getText();
       Thread.sleep(5000);
        String CaseId1 = "1FDV-25-0001922";
        System.out.println("Page title is: " + CaseId);
        Assert.assertEquals(CaseId1, CaseId);
        if (CaseId1.equals(CaseId)){
            test.log(Status.PASS, "Test Pass With Validation");
        }else {
            test.log(Status.FAIL, "Test Pass With Validation");
        }
        driver.findElement(By.xpath(Home)).click();
        Thread.sleep(5000);
    }
}



