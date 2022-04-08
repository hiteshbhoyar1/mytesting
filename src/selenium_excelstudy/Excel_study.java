package selenium_excelstudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_study {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//file path is given and stored file in ref variable
		FileInputStream myfile = new FileInputStream("D:\\poi-bin-5.2.1-20220224\\excel1.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		String name = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("the data from the excel is "+name);
		
		String surname = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println("the data from excel is "+surname);
		
		double number = sheet.getRow(0).getCell(2).getNumericCellValue();
		System.out.println("the data from the excel is "+number);
		
		String address = sheet.getRow(0).getCell(3).getStringCellValue();
		System.out.println("Data in excel is "+address);
		
		String road = sheet.getRow(0).getCell(4).getStringCellValue();
		System.out.println("Data in excel is "+road);
		
		double pin = sheet.getRow(0).getCell(5).getNumericCellValue();
		System.out.println("Data in excel is "+pin);
		
	}

}
