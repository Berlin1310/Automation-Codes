package newpackage;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet");
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		
		char i = 'c';
		 while(i<=ch) {
			 System.out.println(i);
			 i++;
		 }
		
		}
	}


