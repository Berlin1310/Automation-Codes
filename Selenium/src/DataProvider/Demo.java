package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo {
	
	@DataProvider(name="Testdata")
	public Object getdata() {
		
		Object data[][]=new Object[2][2];
		
		data[0][0]="hello";
		data[0][1]="123";
		
		data[1][0]="Abhijit";
		data[1][1]="456";
		
		return data;
		
	}
	
	@Test(dataProvider="Testdata")
	public void login(String username,String password) {
		
		System.out.println("Username is "+username);
		System.out.println("password is "+password);
	}
	
	
	
	
}
