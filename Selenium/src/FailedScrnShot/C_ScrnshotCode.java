package FailedScrnShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class C_ScrnshotCode extends A_MainTest 
{
	public static String code(String ScrnshotName) throws IOException {
		
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:/Users/abhij/Pictures/abc.bmp");
		
		FileUtils.copyFile(s, d);
		
		return ScrnshotName;
		
	}
	

}
