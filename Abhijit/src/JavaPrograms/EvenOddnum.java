package JavaPrograms;

import java.util.Scanner;

public class EvenOddnum {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//int a = 6;
		
		if(a%2==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
	}

}
