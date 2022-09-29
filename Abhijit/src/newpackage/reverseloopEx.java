package newpackage;

import java.util.Scanner;

public class reverseloopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();
		//System.out.println(i);
		
		int a = 25;
		while(a>=i) {
			System.out.println(a);
			a--;
		}

	}

}
