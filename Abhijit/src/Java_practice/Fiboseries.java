package Java_practice;

import java.util.Scanner;

public class Fiboseries {

	public static void main(String[] args) {

		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		int temp = no;
		int a=0,b=0,c=1;
		System.out.print("The Factorial of "+no+" is ");
		
		for(int i=0;i<temp;i++) {
			
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
		
	}

}
