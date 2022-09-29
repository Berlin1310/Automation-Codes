package stringhandling;

public class Stringbuilder {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("Welcome to");
		s.append("Dharashiv");
		System.out.println(s);
		
		s.insert(0, "Hello and");
		System.out.println(s);
		
		s.replace(0, 5, "Namaskar");
		System.out.println(s);
		
		s.delete(0, 12);
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		
		System.out.println(s.capacity());
		
	}

}
