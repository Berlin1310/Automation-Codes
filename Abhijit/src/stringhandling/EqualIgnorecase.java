package stringhandling;

public class EqualIgnorecase {

	public static void main(String[] args) {

		String a = "POOJA";
		String a1 = "pooja";
		
		System.out.println(a.equalsIgnoreCase(a1));
		
		String x = new String("ABHIJIT");
		//System.out.println(x);
		String x1 = new String("Abhi");
		//System.out.println(x1);
		System.out.println(x.equalsIgnoreCase(x1));
	}

}
