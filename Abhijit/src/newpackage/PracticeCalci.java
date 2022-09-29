package newpackage;

import java.util.Scanner;

public class PracticeCalci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ans;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("1:Add\t2:Sub\t3:Mul\t4:Div\t5:Remainder");
		System.out.println("Enter your Choice");
		int i = sc.nextInt();
		System.out.println("Enter 3 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		switch(i) {
		
		case 1 :
			System.out.println(a+b+c);
			break;
			
		case 2:
			System.out.println(a-b-c);
			break;
		case 3:
			System.out.println(a*b*c);
			break;
		case 4:
			System.out.println(a/b/c);
			break;
		case 5:
			System.out.println(a%b%c);
			break;
			default:
				System.out.println("Invalid choice");
				
		}System.out.println("Do you want to continue");
		ans = sc.next().charAt(0);
		System.out.println(ans);
		
	}while(ans=='y');
}
}
