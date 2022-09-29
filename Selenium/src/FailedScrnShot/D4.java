package FailedScrnShot;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class D4 implements ITestListener  {
	
	public void onTestFailure (ITestResult result) {
		
		try {
			C3.Scrnshotcode(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
