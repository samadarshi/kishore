package excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelread {

	public static void main(String[] args) {
		try {
			
			FileInputStream fis=new FileInputStream("./input.xlsx");
			Workbook WB=WorkbookFactory.create(fis); // 
			Sheet s1=WB.getSheet("Sheet1");
			Row r1=s1.getRow(0);
			Cell c1=r1.getCell(4);
			String str = c1.getStringCellValue();
			System.out.println(str);
			
			
		} 
		catch (Exception e) {
		
		}

	}

}
