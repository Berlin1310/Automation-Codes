package JavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		System.out.print("Enter the Number:: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int t1=num;
		int l = 0;
		while(t1!=0) {
			t1 = t1/10;
			l = l+1;
		}
		System.out.print("The length of "+num+" is:: "+l);
		
		int t2=num;
		int arm=0;
		int rem;
		int mul=1;
		while(t2!=0) {
			rem = t2%10;
			for(int i=1;i<=l;i++) {
				mul = mul*rem;
			}
			arm = arm+mul;
			t2=t2/10;
		}
		if(arm==num) {
			System.out.print("\n"+num+"  is Armstrong Number");
		}else {
			System.out.print("\n"+num+" is not Armstrong Number");
		}
	}
}
