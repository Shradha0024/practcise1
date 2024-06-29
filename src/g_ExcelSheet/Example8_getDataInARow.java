package g_ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example8_getDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
			
			FileInputStream file = new FileInputStream("C:\\Users\\anasa\\OneDrive\\Desktop\\28th Jan excel.xlsx");
			
		    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		    
		    int lastCellindex = sh.getRow(0).getLastCellNum()-1;
		    
		    for(int i=0; i<=lastCellindex; i++)
		    {
		    	Cell cellInfo = sh.getRow(0).getCell(i);//reched cell
			    CellType s1 = cellInfo.getCellType();//gettype of cell
			    
			    if(s1==CellType.STRING)
			    {
			    	String value = cellInfo.getStringCellValue();
			    	System.out.print(value+" ");
			    }
			    else if(s1==CellType.NUMERIC)
			    {
			    	double value = cellInfo.getNumericCellValue();
			    	System.out.print(value+" ");
			    }
			    else if(s1==CellType.BOOLEAN)
			    {
			    	 boolean value = cellInfo.getBooleanCellValue();
			    	System.out.print(value+" ");
			    	
			    }
			    
		    }
			
	}

}