package JavaPrograms;

import java.util.Scanner;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:: ");
		String W = sc.nextLine();
		
		System.out.println("The Original String is:: "+W);
		String nW = " ";
		
		for(int i=0;i<W.length();i++) {
			char ch = W.charAt(i);
			
			if (ch!=' ') {
				nW = nW +ch;
				W = W.replace(ch, ' ');
			}
		}
		System.out.println("The New String is:: "+nW);
  }

}
