package JavaPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String::");
		String s = sc.next();
		
		int leng = s.length();
		System.out.println("The Length of the String "+s+" is "+leng);
		
		String rev = "";
		
		for(int i = leng-1;i>=0;i--) {
			
			rev = rev + s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("The String "+s+" is Palindrome");
		}else {
			System.out.println("The String "+s+" is not Palindrome");
		}
		}

}
