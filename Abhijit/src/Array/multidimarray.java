package Array;

public class multidimarray {

	public static void main(String[] args) {

		int a[][]=new int[3][2];
		
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		a[2][0]=5;
		a[2][1]=6;
		
		System.out.println(a[0][1]);
		System.out.println(a[1][1]*a[2][0]);
	}

}
