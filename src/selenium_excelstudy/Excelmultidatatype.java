package selenium_excelstudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelmultidatatype {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("D:\\poi-bin-5.2.1-20220224\\sheet3.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet3");
//		CellType type1 = mysheet.getRow(0).getCell(0).getCellType();
//		CellType type2 = mysheet.getRow(0).getCell(1).getCellType();
//		CellType type3 = mysheet.getRow(0).getCell(2).getCellType();
//		CellType type4 = mysheet.getRow(0).getCell(3).getCellType();
//		
//		System.out.println(type1);
//		System.out.println(type2);
//		System.out.println(type3);
//		System.out.println(type4);
//		
//		String value1 = mysheet.getRow(0).getCell(0).getStringCellValue();
//		double value2 = mysheet.getRow(0).getCell(1).getNumericCellValue();
//		boolean value3 = mysheet.getRow(0).getCell(2).getBooleanCellValue();
//		String value4 = mysheet.getRow(0).getCell(3).getStringCellValue();
//		System.out.print(value1+" ");
//		System.out.print(value2+" ");
//		System.out.print(value3+" ");
//		System.out.print(value4+" ");
//		
	   int rows = mysheet.getLastRowNum();
	  for(int i=0;i<=rows;i++) {
		  short columns = mysheet.getRow(i).getLastCellNum();
		  for(int j=0;j<=columns-1;j++) {
			 CellType type = mysheet.getRow(i).getCell(j).getCellType();
			 String s = type.toString();
			 if(s.equals("STRING")) {
				 String value1 = mysheet.getRow(i).getCell(j).getStringCellValue();
				 System.out.print(value1+" ");
			 }
			 else if(s.equals("NUMERIC")) {
				double value2 = mysheet.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(value2+" ");
			 }
			 else {
				boolean value3 = mysheet.getRow(i).getCell(j).getBooleanCellValue();
				System.out.print(value3+" ");
			 }
			 
		  }
		  System.out.println();
		  
	  }
	   
		}
		
		
		
		
		
		
		

	}


