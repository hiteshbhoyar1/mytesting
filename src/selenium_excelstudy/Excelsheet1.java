package selenium_excelstudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("D:\\poi-bin-5.2.1-20220224\\sheet2.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		int rows = mysheet.getLastRowNum();
		for(int i=0;i<=rows;i++) {
			short columns = mysheet.getRow(i).getLastCellNum();
			for(int j=0;j<=columns-1;j++) {
				CellType type = mysheet.getRow(i).getCell(j).getCellType();
				String s = type.name();
				if(s.equals("STRING")) {
					String value1 = mysheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value1+" ");
				}
				else {
					double value2 = mysheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value2+" ");
				}
			}
			System.out.println();
		}

	}

}
