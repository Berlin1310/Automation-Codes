package Java_practice;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {

		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		int temp = no;
		int rev=0,rem;
		
		while(temp!=0) {
			
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		
		if(no==rev) {
			System.out.println("The number is Palindrome");
		}
		else {
			System.out.println("The number is not Palindrome");
		}
	}

}
