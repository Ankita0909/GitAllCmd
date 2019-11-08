package Generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class excel implements Constants {

	public static void setvalue(String sheet, int r,int cell,String data) throws EncryptedDocumentException, IOException, InvalidFormatException, InterruptedException {
		
		
			FileInputStream fis=new FileInputStream(excel_path);
			Workbook wb= WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheet);
			Cell c = sh.createRow(r).createCell(cell);
			c.setCellValue(data);
			FileOutputStream fos=new FileOutputStream(excel_path);
			wb.write(fos);
			
//			return data;
		}
	
}
