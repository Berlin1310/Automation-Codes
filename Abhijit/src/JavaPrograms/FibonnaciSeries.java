package JavaPrograms;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		//int n=15, 
		int a=0,b=0,c=1;
		System.out.print("Fibonacci series of "+n+" is ");
		
		for(int i=0; i<n;i++) {
			
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
		
		}
		
	}


