package stringhandling;

public class Stringcomparsions {

	public static void main(String[] args) {

		String s1 = new String("Hello");
		System.out.println(s1);
		
		String s2 = new String("Hhello");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		if(s1.equals(s2))
		System.out.println("Equal");
		
		System.out.println(s1.compareTo(s2));
	}

}
