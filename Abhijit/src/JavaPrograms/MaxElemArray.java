package JavaPrograms;

import java.util.Scanner;

public class MaxElemArray {

	public static void main(String[] args) {

		System.out.print("Enter the size of Array - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[]= new int[n];
		
		System.out.print("Enter the Array elements - ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.print("The Array Elements are - ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
		
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.print("\nThe Max Element is - "+max);

}
}
