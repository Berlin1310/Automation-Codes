package stringhandling;

public class stringconca {

	public static void main(String[] args) {

		String a = "Welcome";
		String a1 = "to";
		String a2 = "Java";
		System.out.println(a + a1 + a2);
		
		System.out.println(a+1);
		System.out.println(1+a1);
		System.out.println((2+5)+a2);
		System.out.println(a+5+7);
		
		System.out.println(a.concat(a2));
	}

}
