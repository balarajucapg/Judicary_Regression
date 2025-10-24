package Pages;
import BaseTest.Base;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Tests.TestCases_Run.driver;
import static Tests.TestCases_Run.test;


public class Utilities {

    public static String takeScreenshot(WebDriver driver, String screenshotName) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("MMM_dd_yyyy_hh_mm_ss_a").format(new Date());
        //String destPath = System.getProperty("user.dir") + "/screenshots/" + screenshotName + "_" + timestamp + ".png";
        String destPath = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";
        File destFile = new File(destPath);
        try {
            Files.createDirectories(destFile.getParentFile().toPath());
            Files.copy(srcFile.toPath(), destFile.toPath());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return destPath;
    }



    //To Read Excel Test Data.
    public static String getExcelCellData(String filePath, String sheetName, int rowNum, int colNum) {
            String cellData = "";

            try (FileInputStream fis = new FileInputStream(filePath);
                 Workbook workbook = new XSSFWorkbook(fis)) {

                Sheet sheet = workbook.getSheet(sheetName);
                Row row = sheet.getRow(rowNum);
                Cell cell = row.getCell(colNum);

                if (cell != null) {
                    switch (cell.getCellType()) {
                        case STRING:
                            cellData = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                cellData = cell.getDateCellValue().toString();
                            } else {
                                cellData = String.valueOf(cell.getNumericCellValue());
                            }
                            break;
                        case BOOLEAN:
                            cellData = String.valueOf(cell.getBooleanCellValue());
                            break;
                        case FORMULA:
                            cellData = cell.getCellFormula();
                            break;
                        case BLANK:
                            cellData = "";
                            break;
                        default:
                            cellData = "Invalid Cell Type";
                    }
                } else {
                    cellData = "Cell is null";
                }

            } catch (IOException e) {
                cellData = "Error reading file: " + e.getMessage();
            }

            return cellData;

    }
    public static void Reporting_Pass(String Report) throws InterruptedException {
        test.pass(Report);
        takeScreenshot(driver, Report);
        Thread.sleep(5000);
        driver.close();
    }
    public static void Reporting_Fail(String Report) throws InterruptedException {
        takeScreenshot(driver, Report);
        Thread.sleep(5000);
        driver.close();
        Assert.fail("Failing this test due to data mismatch");
    }

}
