package selenium_excelstudy;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.RowIdLifetime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Blank_multiple {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("D:\\poi-bin-5.2.1-20220224\\sheet2.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("sheet7");
		int TotalRows = sheet.getLastRowNum();
		
		for(int i=0;i<=TotalRows;i++) {
			short Totalcolumns = sheet.getRow(i).getLastCellNum();
			for(int j=0;j<=Totalcolumns-1;j++) {
			CellType type = sheet.getRow(i).getCell(j,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getCellType();
				
				
			String value = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+"  ");
				
			}
			System.out.println();
		}
	}

}
