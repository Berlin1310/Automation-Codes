package TypeCasting;

public class Test {

	public static void main(String[] args) {
     
		// Int to byte
		int a = 25;
		System.out.println(a);
		byte b = (byte) a; // 8 bit so casting is needed.
		System.out.println(b);
		
		byte b1 = 100;
		System.out.println(b1);
		int a1 = b1;  // no need of casting as byte is less than int in memeory allocation.  i.e byte = 8 bit and int = 32 bit.
		
		//Int to float
		float f = (float) a; //32 bit same as int. casting optional but recommended.
		System.out.println(f);
		
		float f1 = 65.52f;
		int a2 = (int) f1; //casting needed as data type is diff.
		System.out.println(a2);
		
		//Int to short
		short s = (short) a; //16 bit so casting is needed.
		System.out.println(s);
		
		short s1 = 15;
		int a3 = s1;
		System.out.println(a3); // no casting needed.
		
		//Int to long
		long l = a;//64 bit so no need to cast.
		System.out.println(l);
		
		long l1 = 12345675;
		int a4 = (int) l1;  // casting needed. Higher to lower. 64 bit to 32 bit 
		System.out.println(a4);
		
		// Int to double 
		double d = a;  // 64 bit no casting required.
		System.out.println(d);
		
		double d1 = 24.253548;
		int a5 = (int) d1;  // casting needed as higher to lower 64 bit to 32 bit.
		System.out.println(a5);
		
		//Int to char
		//char c = (char) a;   // not possible
		//System.out.println(c);
		
		// Int to String
		//String s1 = a;
		//System.out.println(s1);   Not Possible.
	}

}
