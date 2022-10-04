package Java_practice;

import java.util.Scanner;

public class PalinDromeString {

	public static void main(String[] args) {

		 System.out.print("Enter the String to check: ");
		 Scanner sc = new Scanner(System.in);
		 String name = sc.next();
		 
		 int leng = name.length();
		 System.out.println("The length of String "+name+" is "+leng);
		 
		 String rev = "";
		 
		 for(int i=leng-1;i>=0;i--) {
			 
			 rev = rev+name.charAt(i);
		 }
		 
		 System.out.println("The Reverse of String "+name+" is "+rev);
		 
		 if(name.equals(rev)) {
			 System.out.println("The String is Palindrome");
		 }
		 else {
			 System.out.println("The String is not Palindrome");
		 }
	}

}
