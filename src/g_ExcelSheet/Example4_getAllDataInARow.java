package g_ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4_getAllDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
			
			FileInputStream file = new FileInputStream("C:\\Users\\anasa\\OneDrive\\Desktop\\28th Jan excel.xlsx");
			
		  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
			             
			int lastCellindex = sh.getRow(0).getLastCellNum()-1;
			//            0<=3
			//            1<=3
			//            2<=3
			//            3<=3
			//            4<=3   loopbreak
			for(int i=0; i<=lastCellindex; i++)//row index constant and column index changes
			{   //                                  0
				//                                  1
				//                                  2
				//              constant            3
				String value = sh.getRow(0).getCell(i).getStringCellValue();
				System.out.println(value+" "); //abc1//abc2 //abc3 //xyz4
			}
			
	}

}
