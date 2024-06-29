package g_ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4_getAllDataInAColumn 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
			
			FileInputStream file = new FileInputStream("C:\\Users\\anasa\\OneDrive\\Desktop\\28th Jan excel.xlsx");
			
		    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
			             
			int LastRowindex = sh.getLastRowNum();
			//            0<=3
			//            1<=3
			//            2<=3
			//            3<=3
			//            4<=3   loopbreak
			for(int i=0; i<=LastRowindex; i++)//column index constant and row index changes
			{   //                                  0
				//                                  1
				//                                  2
				//              constant            3
				String value = sh.getRow(i).getCell(0).getStringCellValue();
				System.out.println(value+" "); //abc1//abc2 //abc3 //xyz4
			}
			
	}

}
