package JavaPrograms;

import java.util.Scanner;

public class MinElemArray {

	public static void main(String[] args) {

		System.out.print("Enter the size of Array - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[]= new int[n];
		
		System.out.print("Enter the Array Elements - ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("The Array Elements are - ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
		
		int min = a[0];
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.print("\nThe Min. Element is - "+min);
	}

}
