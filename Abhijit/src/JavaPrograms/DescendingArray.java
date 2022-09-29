package JavaPrograms;

import java.util.Scanner;

public class DescendingArray {

	public static void main(String[] args) {

		System.out.print("Enter the Size of Array:: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[]=new int[n];
		int i,j,temp=0;
		
		System.out.print("Enter the Elements of Array:: ");
		for(i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		
		System.out.print("The Elements of Array are:: ");
		for(i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
		
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.print("\nThe descending order of Array is:: ");
		for(i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
	}

}
