package Pages;

import BaseTest.Base;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import static Tests.TestCases_Run.driver;



public class JEFSCaseCreationFC {
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

    public static void JEFS_Family_Case_Creation(int a) throws InterruptedException, IOException, ParseException {


        String filePath = "C:\\Users\\balard\\OneDrive - Capgemini\\Desktop\\New folder\\SeleniumPractice\\Judicary_Regression\\testdataJEFS_FCCaseCreation.xlsx";
        String UserID = Utilities.getExcelCellData(path, sheet, a, 17);
        String Password = Utilities.getExcelCellData(path, sheet, a, 18);
        String ShortTitle = Utilities.getExcelCellData(path, sheet, a, 2);
        String CaseTitle = Utilities.getExcelCellData(path, sheet, a, 3);
        String CourtSelect = Utilities.getExcelCellData(path, sheet, a, 19);
        String Case = Utilities.getExcelCellData(path, sheet, a, 1);
        String Circuit = Utilities.getExcelCellData(path, sheet, a, 19);
        String Naturofaction = Utilities.getExcelCellData(path, sheet, a, 20);
        String MeathodofCaseInitiation = Utilities.getExcelCellData(path, sheet, a, 21);
        String TaxmapkeyNumber = Utilities.getExcelCellData(path, sheet, a, 8);
        String Addres = Utilities.getExcelCellData(path, sheet, a, 22);
        String Partyid = Utilities.getExcelCellData(path, sheet, a, 23);
        String Roll = Utilities.getExcelCellData(path, sheet, a, 24);
        String DocumentCat = Utilities.getExcelCellData(path, sheet, a, 9);
        String Documenttype = Utilities.getExcelCellData(path, sheet, a, 10);
        String FilingParty = Utilities.getExcelCellData(path, sheet, a, 11);
        String Defendants = Utilities.getExcelCellData(path, sheet, a, 27);
        String Attorney = Utilities.getExcelCellData(path, sheet, a, 7);
        String ApplicableFee = Utilities.getExcelCellData(path, sheet, a, 25);
        String OwedBy = Utilities.getExcelCellData(path, sheet, a, 26);
        String Court = Utilities.getExcelCellData(path, sheet, a, 0);
        String Circumstance = Utilities.getExcelCellData(path, sheet, a, 28);
        String NumberOfChil = Utilities.getExcelCellData(path, sheet, a, 29);
        String PrtitionerType = Utilities.getExcelCellData(path, sheet, a, 30);
        String InOutHawaii = Utilities.getExcelCellData(path, sheet, a, 31);
        String Issue = Utilities.getExcelCellData(path, sheet, a, 32);
        String DegreeOfDangerous = Utilities.getExcelCellData(path, sheet, a, 33);



      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);
        driver.findElement(By.xpath(Create_Case)).click();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);
        Select Court1 = new Select(driver.findElement(By.id(Court_Type)));
        Court1.selectByVisibleText(Court);
        Thread.sleep(5000);
        Select CaseTye = new Select(driver.findElement(By.id(Case_Type)));
        CaseTye.selectByVisibleText(Case);
        Thread.sleep(5000);
        driver.findElement(By.xpath(Submit)).click();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);
        Select Court2 = new Select(driver.findElement(By.id(Filing_Court)));
        Court2.selectByVisibleText(Circuit);
        Thread.sleep(5000);
        Select NaturOfAction = new Select(driver.findElement(By.id(NaturOfActions)));
        NaturOfAction.selectByVisibleText(Naturofaction);
        List<WebElement> InnOutHawaii = driver.findElements(By.id("caseInitBeanFormCivil:inOutHawaiiSelectItems"));
        if (!InnOutHawaii.isEmpty()) {
            // Element is present, do something
            Select InnOutHawaiis = new Select(driver.findElement(By.id("caseInitBeanFormCivil:inOutHawaiiSelectItems")));
            InnOutHawaiis.selectByVisibleText(InOutHawaii);
        }
        List<WebElement> Issue1 = driver.findElements(By.id("caseInitBeanFormCivil:issueSelectItems"));
        if (!Issue1.isEmpty()) {
            // Element is present, do something
            Select Issues = new Select(driver.findElement(By.id("caseInitBeanFormCivil:issueSelectItems")));
            Issues.selectByVisibleText(Issue);
        }
        Thread.sleep(5000);
        List<WebElement> Petiotioner = driver.findElements(By.id("caseInitBeanFormCivil:petitionerTypeSelectItems"));
        if (!Petiotioner.isEmpty()) {
            // Element is present, do something
            Select Petiotioners = new Select(driver.findElement(By.id("caseInitBeanFormCivil:petitionerTypeSelectItems")));
            Petiotioners.selectByVisibleText(PrtitionerType);
        }
        List<WebElement> Degreeof = driver.findElements(By.id("caseInitBeanFormCivil:degreeOfDangerSelectItems"));
        if (!Degreeof.isEmpty()) {
            // Element is present, do something
            Select DegreeofDander = new Select(driver.findElement(By.id("caseInitBeanFormCivil:degreeOfDangerSelectItems")));
            DegreeofDander.selectByVisibleText(DegreeOfDangerous);
        }
        List<WebElement> elements = driver.findElements(By.id("caseInitBeanFormCivil:circumstanceSelectItems"));
        if (!elements.isEmpty()) {
            // Element is present, do something
            Select Circumstanc = new Select(driver.findElement(By.id("caseInitBeanFormCivil:circumstanceSelectItems")));
            Circumstanc.selectByVisibleText(Circumstance);
        }
        Thread.sleep(5000);
        List<WebElement> elements1 = driver.findElements(By.id("caseInitBeanFormCivil:numberOfMinorChildrenSelectItems"));
        if (!elements1.isEmpty()) {
            // Element is present, do something
            Select NumberOfChild = new Select(driver.findElement(By.id("caseInitBeanFormCivil:numberOfMinorChildrenSelectItems")));
            NumberOfChild.selectByVisibleText("1");
        }
        Select MethodOfCaseInitiation = new Select(driver.findElement(By.id(MethodOfCaseInitiations)));
        MethodOfCaseInitiation.selectByVisibleText(MeathodofCaseInitiation);
        Thread.sleep(5000);
        // driver.findElement(By.xpath("//[@id='caseInitBeanFormCivil:civilTaxMapKeyNumber']")).sendKeys("25025");
        WebElement strLocator = driver.findElement(By.xpath(TaxMapKeyNumber));
        strLocator.sendKeys("123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormCivil:j_idt113']")).click();
       Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormCivil:civilPremisesAddress']")).sendKeys(Addres);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormCivil:shortCaseTitle']")).sendKeys(ShortTitle);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormCivil:caseTitle']")).sendKeys(CaseTitle);
        //Add Party
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormCivil:j_idt130:AddParty']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormParty:j_idt84']")).sendKeys(Partyid);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormParty:Search']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormParty:searchPartyResults_row_0']")).click();
        Select Role = new Select(driver.findElement(By.id("caseInitBeanFormParty:j_idt137")));
        Role.selectByVisibleText(Roll);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormParty:j_idt149:_1']")).click();
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormParty:j_idt154:_1']")).click();
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormParty:j_idt158:_1']")).click();
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormParty:Assign']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormParty:ResetSearch']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormParty:j_idt84']")).sendKeys(Attorney);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormParty:Search']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormParty:searchPartyResults_row_0']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormParty:Assign']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormParty:ReturnCaseInit']")).click();
        Thread.sleep(5000);
        //Document Information
        Select DocumentCategory = new Select(driver.findElement(By.xpath("//*[@id='caseInitBeanFormCivil:j_idt204:documentCat']")));
        DocumentCategory.selectByVisibleText(DocumentCat);
        Thread.sleep(3000);
        Select DocumentType = new Select(driver.findElement(By.id("caseInitBeanFormCivil:j_idt204:documentType")));
        DocumentType.selectByVisibleText(Documenttype);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormCivil:j_idt204:documentTitle']")).sendKeys("@72534");
        Select FilingPartys = new Select(driver.findElement(By.id("caseInitBeanFormCivil:j_idt204:documentFilingParty")));
        FilingPartys.selectByVisibleText(FilingParty);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormCivil:j_idt204:assignFilingPartyActionID']/img")).click();
        Thread.sleep(3000);
        Select Defendant = new Select(driver.findElement(By.id("caseInitBeanFormCivil:j_idt204:documentDefendant")));
        Defendant.selectByVisibleText(Defendants);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormCivil:j_idt204:assignDefendantActionID']/img")).click();
        Thread.sleep(3000);
        //File upload
        WebElement addFile = driver.findElement(By.cssSelector("input[type='file']"));
        addFile.sendKeys("C:\\Users\\balard\\OneDrive - Capgemini\\Desktop\\Sample.pdf");
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormCivil:j_idt204:_t246']")).click();
        Thread.sleep(3000);
        //Add Document
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormCivil:j_idt204:documentsAddButton']")).click();
        Thread.sleep(3000);
        List<WebElement> ApplicableFee1 = driver.findElements(By.id("caseInitBeanFormCivil:j_idt296:ApplicableFeeTable:0:feeCode"));
        if (!ApplicableFee1.isEmpty()) {
            // Element is present, do something
            Select ApplicableFe = new Select(driver.findElement(By.id("caseInitBeanFormCivil:j_idt296:ApplicableFeeTable:0:feeCode")));
            ApplicableFe.selectByVisibleText(ApplicableFee);
            Thread.sleep(3000);
            Select OwedB = new Select(driver.findElement(By.id("caseInitBeanFormCivil:j_idt296:owedBy")));
            OwedB.selectByVisibleText(OwedBy);
        }
        //Submit
        driver.findElement(By.xpath("//*[@id='caseInitBeanFormCivil:Submit']")).click();
        Thread.sleep(3000);
        List<WebElement> buttons = driver.findElements(By.id("caseInitBeanFormCivil:j_idt378"));
        if (!buttons.isEmpty()) {
            driver.findElement(By.xpath("//*[@id='caseInitBeanFormCivil:j_idt378']")).click();
        }

        Thread.sleep(7000);





    }
    @AfterTest
    public void tearDowns() throws IOException, ParseException {
        if (Test != "True") {
            SummaryReporter(CaseType, "Fail");
            String StartTime1 = StartTime();
            String EndTime1 = EndTime(CaseType);
            StartingEndingDateAndTime(CaseType, StartTime1, EndTime1);
            TakesScreenshot ts = (TakesScreenshot) driver;
            // Capture screenshot as output type FILE
            File file = ts.getScreenshotAs(OutputType.FILE);
            //save the screenshot taken in destination path
            FileUtils.copyFile(file, new File("C:\\Users\\balard\\OneDrive - Capgemini\\Desktop\\Automation_Regression\\ResultFiles\\"+CaseType+".png"));
            // Print the title after screenshot capture
            String title = driver.getTitle();

            //driver.quit();
        }
    }

    public void  SummaryReporter(String SummaryCaseid, String Status) throws IOException {

        // identify location of .xlsx file
        File f = new File("C:\\Users\\balard\\OneDrive - Capgemini\\Desktop\\Automation_Regression\\Summary.xlsx");
        FileInputStream i = new FileInputStream(f);

        // instance of XSSFWorkbook
        XSSFWorkbook w = new XSSFWorkbook(i);

        // create sheet in XSSFWorkbook with name Details1
        XSSFSheet s = w .getSheet("Summary");

        // handle total rows in XSSFSheet
        int r = s.getLastRowNum() - s.getFirstRowNum();

        // loop through rows, read and enter values in form
        for(int j = 1; j <= 8; j++) {
            //System.out.println(s.getRow(j).getCell(1).getStringCellValue());
            String TestCaseName = s.getRow(j).getCell(1).getStringCellValue();
            if (SummaryCaseid.equals(TestCaseName))
            {

                // create cell at Column 3 to write values in excel
                XSSFCell c = s.getRow(j).createCell(3);
                c.setCellValue(Status);

            }

            // complete writing value in excel
            FileOutputStream o = new FileOutputStream("C:\\Users\\balard\\OneDrive - Capgemini\\Desktop\\Automation_Regression\\Summary.xlsx");
            w.write(o);
        }

        // closing workbook object
        w.close();
    }

    public  void StartingEndingDateAndTime(String SummaryCaseid, String StartTime, String EndTime) throws IOException, ParseException {
        // identify location of .xlsx file
        File f = new File("C:\\Users\\balard\\OneDrive - Capgemini\\Desktop\\Automation_Regression\\Summary.xlsx");
        FileInputStream i = new FileInputStream(f);

        // instance of XSSFWorkbook
        XSSFWorkbook w = new XSSFWorkbook(i);

        // create sheet in XSSFWorkbook with name Details1
        XSSFSheet s = w .getSheet("Summary");

        // handle total rows in XSSFSheet
        int r = s.getLastRowNum() - s.getFirstRowNum();

        // loop through rows, read and enter values in form
        for(int j = 1; j <= 8; j++) {
            //System.out.println(s.getRow(j).getCell(1).getStringCellValue());
            String TestCaseName = s.getRow(j).getCell(1).getStringCellValue();
            if (SummaryCaseid.equals(TestCaseName))
            {

                // create cell at Column 3 to write values in excel
                XSSFCell c = s.getRow(j).createCell(4);
                c.setCellValue(StartTime);
                String Time1 = StartTime.substring(11, 19);
                System.out.println(Time1);

                // create cell at Column 3 to write values in excel
                XSSFCell c1 = s.getRow(j).createCell(5);
                c1.setCellValue(EndTime);
                String Time2 = EndTime.substring(11, 19);
                System.out.println(Time2);

                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                Date date1 = format.parse(Time1);
                Date date2 = format.parse(Time2);;


                // Calculating the difference in milliseconds
                long differenceInMilliSeconds
                        = Math.abs(date2.getTime() - date1.getTime());

                // Calculating the difference in Hours
                long differenceInHours = (differenceInMilliSeconds / (60 * 60 * 1000)) % 24;

                // Calculating the difference in Minutes
                long differenceInMinutes = (differenceInMilliSeconds / (60 * 1000)) % 60;

                // Calculating the difference in Seconds
                long differenceInSeconds = (differenceInMilliSeconds / 1000) % 60;
                String TimeTaken = differenceInHours +":"+ differenceInMinutes +":"+ differenceInSeconds;
                XSSFCell c2 = s.getRow(j).createCell(6);
                c2.setCellValue(TimeTaken);
            }

            // complete writing value in excel
            FileOutputStream o = new FileOutputStream("C:\\Users\\balard\\OneDrive - Capgemini\\Desktop\\Automation_Regression\\Summary.xlsx");
            w.write(o);
        }

        // closing workbook object
        w.close();
    }

    public String SummaryFlag(String SummaryCaseid) throws IOException {
        // identify location of .xlsx file
        File f = new File("C:\\Users\\balard\\OneDrive - Capgemini\\Desktop\\Automation_Regression\\Summary.xlsx");
        FileInputStream i = new FileInputStream(f);

        // instance of XSSFWorkbook
        XSSFWorkbook w = new XSSFWorkbook(i);

        // create sheet in XSSFWorkbook with name Details1
        XSSFSheet s = w.getSheet("Summary");

        // handle total rows in XSSFSheet
        int r = s.getLastRowNum() - s.getFirstRowNum();

        // loop through rows, read and enter values in form

        String Flag = null;
        for (int j = 1; j <= 8; j++) {
            //System.out.println(s.getRow(j).getCell(1).getStringCellValue());
            String TestCaseName = s.getRow(j).getCell(1).getStringCellValue();
            if (SummaryCaseid.equals(TestCaseName)) {

                // create cell at Column 3 to write values in excel
                Flag = s.getRow(j).getCell(2).getStringCellValue();

            }

            // complete writing value in excel
            FileOutputStream o = new FileOutputStream("C:\\Users\\balard\\OneDrive - Capgemini\\Desktop\\Automation_Regression\\Summary.xlsx");
            w.write(o);
        }

        // closing workbook object
        w.close();
        return Flag;

    }

    public String StartTime()
    {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String StartTime = currentDateTime.format(Formatter);
        return StartTime;

    }
   
    public String EndTime(String SummaryCaseid) throws IOException {
        // Initialize an instance to the TakeScreenshot class

       //TakesScreenshot ts = (TakesScreenshot) driver;
        // Capture screenshot as output type FILE
       // File file = ts.getScreenshotAs(OutputType.FILE);
        //save the screenshot taken in destination path
       // FileUtils.copyFile(file, new File("C:\\Users\\balard\\OneDrive - Capgemini\\Desktop\\Automation_Regression\\ResultFiles\\"+SummaryCaseid+".png"));
        // Print the title after screenshot capture
       // String title = driver.getTitle();
       // System.out.println("Captured Screenshot for: " + title);

        //driver.quit();
        LocalDateTime currentDateTime1 = LocalDateTime.now();
        DateTimeFormatter Formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String EndTime = currentDateTime1.format(Formatter1);
        System.out.println(EndTime);
        return EndTime;
    }
    

    public static String getCellValue(String filePath, int sheetIndex, int rowNumber, int cellNumber) {
        String cellValue = null;

        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(sheetIndex);
            Row row = sheet.getRow(rowNumber);
            Cell cell = row.getCell(cellNumber);

            // Convert cell to string
            cellValue = cell.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return cellValue;
    }
    @AfterSuite
    public void renameReport() {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File oldReport = new File("test-output/index.html");
        File newReport = new File("test-output/index_" + timestamp + ".html");
        oldReport.renameTo(newReport);
    }
}
