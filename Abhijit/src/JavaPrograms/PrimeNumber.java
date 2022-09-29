package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter the Number");
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   
	   //int n = 7;
	   
	   int temp=0;
	   
	   for(int i=2;i<n;i++) {
		   if(n%i==0) {
			   temp = temp+1;
		   }
	   }
	   if(temp==0) {
		   System.out.println("The Number is Prime");
	   }
	   else {
		   System.out.println("The Number is Non Prime");
	   }
		}
	}


