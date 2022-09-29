package Java_practice;

import java.util.Scanner;

public class Factorialnum {

	public static void main(String[]args) {

		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		long fact = 1;
		
		for(int i=1;i<=no;i++) {
			
			fact = fact*i;
		}
		System.out.println("The factorial of "+no+" is "+fact);
		
	}
}