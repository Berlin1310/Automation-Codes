package Java_practice;

import java.util.Scanner;

public class Factorialnum {

	public static void main(String[]args) {

		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
	
		long fact = 1;
		
		for(int i=1;i<=no;i++) {
			
			fact= fact*i;
		}
		System.out.println("The Factorial of number "+no+" is: "+fact);
		
	}
}