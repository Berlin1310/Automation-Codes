package Java_practice;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {

		System.out.println("Enter the number to check: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		int temp=0;
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				temp=temp+1;
			}
		}
		System.out.println(temp);
		
		if(temp==0) {
			System.out.println("The number is Prime");
		}
		else {
			System.out.println("The number is not Prime");
		}
	}

}
