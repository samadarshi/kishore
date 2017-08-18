package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelwrite {

	public static void main(String[] args) {
try {
			
			FileInputStream fis=new FileInputStream("C:\\Users\\samad\\Desktop\\sam.xlsx");
			Workbook WB=WorkbookFactory.create(fis); // 
			Sheet s1=WB.getSheet("Sheet1");
			Row r1=s1.getRow(0);
			Cell c1=r1.getCell(0);
			c1.setCellValue("good day");
			String v = c1.getStringCellValue();
			System.out.println(v);
			FileOutputStream fos=new FileOutputStream("C:\\Users\\samad\\Desktop\\sam.xlsx");
			
			Thread.sleep(2000);
			WB.write(fos);
			System.out.println("written");
			WB.close();
			
			
		} 
		catch (Exception e) {
		
		}

	}


	

}
