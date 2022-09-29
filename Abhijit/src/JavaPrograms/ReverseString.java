package JavaPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String::");
		String s = sc.next();
		
		int leng = s.length();
		System.out.println("The Length of String "+s+" is "+leng);
		
		String rev = "";
		
		for(int i = leng-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println("The reverse of String "+s+" is "+rev);
	}

}
