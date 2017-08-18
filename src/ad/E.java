package ad;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class E
{

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		FileInputStream fis=new FileInputStream(".\\Input\\input.xlsx");
		Workbook WB=WorkbookFactory.create(fis); // 
		Sheet s1=WB.getSheet("Sheet1");
		Row r1=s1.getRow(0);
		Cell c1=r1.getCell(0);
		//c1.setCellValue("goodday");
		String v = c1.getStringCellValue();
		System.out.println(v);
//		FileOutputStream fos=new FileOutputStream(".\\Input\\input.xlsx");
//		
//		Thread.sleep(2000);
//		WB.write(fos);
//		System.out.println("written");
//		WB.close();	
	}

}
