package g_ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5_getAllDataInASheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
			
			FileInputStream file = new FileInputStream("C:\\Users\\anasa\\OneDrive\\Desktop\\28th Jan excel.xlsx");
			
		    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		    
		    int lastrowindex = sh.getLastRowNum();
		    
		    for(int i=0; i<=lastrowindex; i++)//for rows
		    { 
		    	 int lastcellindex = sh.getRow(i).getLastCellNum()-1;
		    	 for(int j=0; j<=lastcellindex; j++)//for column
		    	 {
		    		 String value = sh.getRow(i).getCell(j).getStringCellValue();
		    		 System.out.print(value+" ");
		    		 
		    	 }
		    	 System.out.println();
		    }
		    
	}

}
