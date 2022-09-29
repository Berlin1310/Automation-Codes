package FailedScrnShot;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class D_GetScrnshot implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		
		try {
			C_ScrnshotCode.code(result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
