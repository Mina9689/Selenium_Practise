package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_Writing_Excel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//create an object for physical file
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get(url);
String title=driver.getTitle();
System.out.println(title);
//write data into excel sheet
wb.getSheet("Sheet1").createRow(6).createCell(0).setCellValue(title);
FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
wb.write(fos);
}
}
