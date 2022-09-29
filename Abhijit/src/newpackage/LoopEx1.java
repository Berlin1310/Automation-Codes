package newpackage;

import java.util.Scanner;

public class LoopEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		System.out.println(a);
		//System.out.println("Enter range");
		//int r  = sc.nextInt();
		//System.out.println(r);
		
		int i = 1;
		while(i<=10) {
			System.out.println(a+"*"+i+"="+a*i);
			i++;
			
		}
		
		
	}

}
