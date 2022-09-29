package ArrayList;

import java.util.ArrayList;

public class ArrayListFloat {

	public static void main(String[] args) {

		ArrayList <Float> f = new ArrayList<>();
		
		f.add(1.50f);
		f.add(2.50f);
		f.add(1.25f);
		f.add(112.75f);
		
		System.out.println(f.get(0));
		System.out.println(f.get(1));
		System.out.println(f.get(2));
		System.out.println(f.get(3));
		
		System.out.println(f.size());
		
		f.remove(2);
		System.out.println(f.size());
		
		System.out.println(f.get(0));
		System.out.println(f.get(1));
		System.out.println(f.get(2));
		
		System.out.println(f.contains(1.50f));
		System.out.println(f.contains(1.25f));
		
		f.clear();
		System.out.println(f.size());
	}

}
