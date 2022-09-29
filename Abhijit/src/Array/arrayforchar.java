package Array;

public class arrayforchar {

	public static void main(String[] args) {

		char c [][]= {{'a','b'},{'c','d'},{'e','f'}};
		
		for(char i=0;i<=2;i++) {
			for(char j=0;j<=1;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
