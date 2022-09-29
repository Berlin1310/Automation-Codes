package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{

		FileInputStream ex = new FileInputStream("C:/Users/abhij/Desktop/DSS Class/Zerodha Kite Test.xlsx");
		
		Sheet a = WorkbookFactory.create(ex).getSheet("Sheet3");
		
		int rowno = a.getPhysicalNumberOfRows();
		
		for(int i=0;i<rowno;i++) {
			
			int cellno = a.getRow(i).getPhysicalNumberOfCells();
			
			for(int j=0;j<cellno;j++) {
				
				int t = (int) a.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(t+" ");
			}
			
			System.out.println();
		}
		
	}

}
