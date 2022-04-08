package selenium_excelstudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Blankcolumn_study {



	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("D:\\poi-bin-5.2.1-20220224\\sheet2.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("sheet6");
		String value1 = sheet.getRow(0).getCell(0).getStringCellValue();
		String value2 = sheet.getRow(0).getCell(1).getStringCellValue();
		  CellType value = sheet.getRow(0).getCell(2,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getCellType();
		String value4 = sheet.getRow(0).getCell(3).getStringCellValue();
		System.out.println(value1+" "+value2+" "+value+" "+value4+" ");
		

	}

}
