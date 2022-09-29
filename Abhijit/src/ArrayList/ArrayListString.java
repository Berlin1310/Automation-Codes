package ArrayList;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {

		ArrayList <String> s = new ArrayList<>();
		
		s.add("Pune");
		s.add("Abhi");
		s.add("Pooja");
		s.add("Sweety");
		
		System.out.println(s.get(0));
		System.out.println(s.get(1));
		System.out.println(s.get(2));
		System.out.println(s.get(3));
		
		System.out.println(s.size());
		s.remove(1);
		System.out.println(s.size());
		System.out.println(s.get(0));
		System.out.println(s.get(1));
		System.out.println(s.get(2));
		
		System.out.println(s.contains("Pune"));
		System.out.println(s.contains("Abhi"));
		
		s.clear();
		System.out.println(s.size() );
	}

}
