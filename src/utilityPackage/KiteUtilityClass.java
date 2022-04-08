package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import net.bytebuddy.utility.RandomString;

public class KiteUtilityClass {
	static Sheet mysheet;
	public static String readDataFromExcel(int rowIndex, int columnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream myfile= new FileInputStream("D:\\poi-bin-5.2.1-20220224\\sheet2.xlsx");
	 mysheet = WorkbookFactory.create(myfile).getSheet("sheet8");
	 String value = mysheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	 return value;
	}
	
	public static void takeScreenShot(WebDriver driver, int TCID) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest= new File("D:\\screenshot\\TC"+TCID+"screenshot.png");
		FileHandler.copy(src, dest);
		Reporter.log("screenshot taken for TC "+TCID);
	}
	public static void takeScreenShot(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    String TCID = RandomString.make(2);
		File dest= new File("D:\\screenshot\\TC"+TCID+"screenshot.png");
		FileHandler.copy(src, dest);
		Reporter.log("screenshot taken for TC "+TCID);
	}

}
