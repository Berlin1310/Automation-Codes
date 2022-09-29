package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
	
	public static void getScreenshot(WebDriver driver) throws IOException {
		
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:/Users/abhij/Desktop/ScreenShots/.png");
		
		FileUtils.copyFile(s, d);
		
		//FileHandler.copy(s, d);
		
	}

	public static String getdatafromExcel(int row,int cell) throws EncryptedDocumentException, IOException {
		
		String uservalue;
		
		FileInputStream excel = new FileInputStream("C:/Users/abhij/eclipse-workspace/FrameWork/TestData/TestingData.xlsx");
		
		Sheet inputdata = WorkbookFactory.create(excel).getSheet("sheet1");
		
		try {
			
			uservalue = inputdata.getRow(row).getCell(cell).getStringCellValue();
		}
		
		catch(Exception e) {
			
			long data = (long) inputdata.getRow(row).getCell(cell).getNumericCellValue();
			
			uservalue = (""+data);
		}
		
		return uservalue;
		
}
}
