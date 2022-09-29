package TypeCasting;

public class StringCasting {

	public static void main(String[] args) {

		String a = "125";
		String b = "225";
		String c = "Pooja";
		System.out.println(a+b+c);
		
		int i = Integer.parseInt(a);
		int i1 = Integer.parseInt(b);
		System.out.println(i+i1);
		
		byte y = Byte.parseByte(a); // range of byte data type is -128 to 127
		System.out.println(y);
		
		short s =Short.parseShort(b);
		System.out.println(s);
		
		long l = Long.parseLong(a);
		System.out.println(l);
		
		float f = Float.parseFloat(b);
		System.out.println(f);
		
		
		double d = Double.parseDouble(a);
		System.out.println(d);
		
		// Not possible   char h=a;
		//System.out.println(c);
	}

}
