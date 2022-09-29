package JavaPrograms;

import java.util.Scanner;

public class AscendingArray {

	public static void main(String[] args) {
		

		//Create object of scanner class
		System.out.print("Enter the Size of Array:: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//Declare and initialize Array and other Required variables..
		int a[]=new int[n];
		int i,j,temp=0;
		
		//Now get all array elements from user
		System.out.print("Enter "+n+" number of Array Elements:: ");
		
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();	
	  }
		//Print all array elements
		System.out.print("All the Array Elements are:: ");
		for(i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
		
		//Now arrange array elements in ascending order
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		//Print array in ascending order...
		System.out.print("\nArray Elements in Ascending Order:: ");
		for(i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
	}


		
	}

