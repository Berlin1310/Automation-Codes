package stringhandling;

public class Stringbuffer {

	public static void main(String[] args) {
		
		StringBuffer st = new StringBuffer("Hello");
		st.append("World");
		System.out.println(st);
		
		st.insert(5, "Welcome");
		System.out.println(st);
		
		st.replace(5, 12, "and");
		System.out.println(st);
		
		st.delete(5, 8);
		System.out.println(st);
		
		st.reverse();
		System.out.println(st);
		
		//st.capacity();
		System.out.println(st.capacity());
	}

}
