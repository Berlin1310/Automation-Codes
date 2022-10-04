package Java_practice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[]args) {
		
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		if(no%2==0) {
			System.out.println("The Number is Even");
		}
		else {
			System.out.println("The Number is Odd");
		}
	}

}
