package Java_practice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

	System.out.println("Enter the number: ");
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
	
	//int no = 25;
	
	if(no%2==0) {
		System.out.println("The number is even");
	}
	else {
		System.out.println("The number is odd");
	}
	
	}

}
