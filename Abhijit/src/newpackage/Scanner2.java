package newpackage;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a");
		int a = sc.nextInt();
		System.out.println(a);
		System.out.println("Enter the b");
		int b = sc.nextInt();
		System.out.println(b);
		
		if(a>b) {
		System.out.println("a is greater than b");
				
			}else if(a==b) {
				System.out.println("a is equal to b");
		}else {
			System.out.println("a is not greater than b");
		}
		
		}
	}



