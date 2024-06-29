package g_ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2_getRowSize 
{
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
				
				FileInputStream file = new FileInputStream("C:\\Users\\anasa\\OneDrive\\Desktop\\28th Jan excel.xlsx");
				
				int rowsize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
				             //getLastRowNum() which return last row index and add 1
				 System.out.println(rowsize);
		}

}
