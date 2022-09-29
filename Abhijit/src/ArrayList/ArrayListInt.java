package ArrayList;

import java.util.ArrayList;

public class ArrayListInt {

	public static void main(String[] args) {

		ArrayList<Integer>a=new ArrayList<>();
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		
		int b = a.get(1);
		System.out.println(a.get(0));
		System.out.println(b);
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
		
		System.out.println(a.size());
		
		a.remove(2);
		System.out.println(a.size());
		
		System.out.println(a.get(0)*a.get(1));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		//System.out.println(a.get(3));   out of bounds index
		
		System.out.println(a.contains(15));
		System.out.println(a.contains(20));
		
		a.clear();
		
		System.out.println(a.size());
	}

}
