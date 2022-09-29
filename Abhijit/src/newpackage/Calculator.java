package newpackage;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ans;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("1:Addition\t2:Subtraction\t3:Multiplication\t4:Division\t5:Remainder");
		System.out.println("Enter your Choice");
		int i = sc.nextInt();
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		switch(i){
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		case 5:
			System.out.println(a%b);
			break;
			default:
				System.out.println("Invalid Choice");
			
		} System.out.println("Do you want to continue");
		 ans = sc.next().charAt(0);

	}  while(ans=='y');
}
}
