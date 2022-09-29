package ArrayList;

import java.util.ArrayList;

public class ArrayListChar {

	public static void main(String[] args) {

		ArrayList <Character> c = new ArrayList<>();
		
		c.add('a');
		c.add('b');
		c.add('d');
		c.add('e');
		
		System.out.println(c.get(0));
		System.out.println(c.get(1));
		System.out.println(c.get(2));
		System.out.println(c.get(3));
		
		System.out.println(c.size());
		
		c.remove(1);
		System.out.println(c.size());
		
		System.out.println(c.get(0));
		System.out.println(c.get(1));
		System.out.println(c.get(2));
		
		System.out.println(c.contains(c));
		System.out.println(c.contains('b'));
		System.out.println(c.contains('a'));
		
		c.clear();
		System.out.println(c.size());
	}

}
