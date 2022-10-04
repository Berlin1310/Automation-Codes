package Java_practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		int leng = name.length();
		System.out.println("The length of String "+name+" is "+leng);
		
		String rev = "";
		
		for(int i=leng-1;i>=0;i--) {
			
			rev = rev+name.charAt(i);
		}
		
		System.out.println("The Reverse of String "+name+" is "+rev);
	}

}
