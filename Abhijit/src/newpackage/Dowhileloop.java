package newpackage;

import java.util.Scanner;

public class Dowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter alphabet");
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		
		char ar = 'a';
		
		do {
			System.out.println(ar);
			ar++;
		}while(ar<=ch);
	}

}
