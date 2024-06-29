package g_ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getStringData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\anasa\\OneDrive\\Desktop\\28th Jan excel.xlsx");
		
		 String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		 System.out.println(value);
		
		
//		Sheet sh = book.getSheet("Sheet1");
//		
//		Row rw = sh.getRow(0); 
//		Cell cl = rw.getCell(0);
//		
//		String value = cl.getStringCellValue();
//		
//		System.out.println(value);
	}

}
