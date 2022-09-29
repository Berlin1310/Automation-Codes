package newpackage;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String a = sc.nextLine();
		System.out.println(a);
		
		System.out.println("Enter last name");
		String s = sc.next();
		System.out.println(s);
		
		System.out.println("Enter the age");
		int i = sc.nextInt();
		System.out.println(i);
		
		System.out.println("Mobile Number");
		long l = sc.nextLong();
		System.out.println(l);
		
		
}

}
