package selenium_excelstudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet_dynamic {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("D:\\poi-bin-5.2.1-20220224\\sheet2.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet2");
		//method for getting the rows from the excel
		int lastrownum = mysheet.getLastRowNum();
		System.out.println("last row number is "+lastrownum);
		int totalrows = lastrownum;
		
	//method for getting the cells
		short lastcellnum = mysheet.getRow(0).getLastCellNum();
		System.out.println(lastcellnum);
		int totalcolumns=lastcellnum-1;
		
		for(int i=0;i<=totalrows;i++) {
			for(int j=0;j<=totalcolumns;j++) {
				String value= mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
	}

}
