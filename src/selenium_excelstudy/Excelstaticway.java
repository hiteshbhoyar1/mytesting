package selenium_excelstudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelstaticway {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("D:\\poi-bin-5.2.1-20220224\\sheet2.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet2");
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
				}
			System.out.println();
		}

	}

}
