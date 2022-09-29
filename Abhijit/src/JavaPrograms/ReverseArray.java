package JavaPrograms;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		System.out.print("Enter the size of Array - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.print("Enter the elements of Array - ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.print("The elements of Array are - ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
		
		System.out.print("\nThe Reverse of Array is - ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(" "+a[i]);
		}
	}

}
