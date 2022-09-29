package Array;

public class arraydemo {

	public static void main(String[] args) {

		int array1[]= {10,20,30,40,50};// index starts from 0,1,2,3,4
		int array2[] = array1;
		
		//System.out.println(array2[0]);
		
		//for(int abc:array2) {
			//System.out.print(abc+" ");
		//}
		
		//for(int i=0;i<array2.length;i++) {
		//	System.out.println(array2[i]);
		//}
		
		//int i = 0;
		//while(i<array2.length) { //length is 5 
		//	System.out.println(array2[i]);
			//i++;
		//}
		
	 int i = 0;
	 do {
		 System.out.print(array2[i]+" ");
		 i++;
	 }while(i<array2.length);
	}

}
