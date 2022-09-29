package newpackage;

public class Ex2 {

	int a = 25;
	String s = "Pooja";
	static double d = 2.5;
	

			public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex2 O = new Ex2();
		System.out.println(O.a);
		System.out.println(O.s);
		System.out.println(d);
		O.x();
		O.z();
		
		String l = O.n();
		System.out.println(l);
		
		int y = O.i();
		System.out.println(y);
	}
			public void x() {
				char c = 'F';
				System.out.println(c);
			}

			public void z() {
				boolean b = true;
				System.out.println(b);
			}
			
			public String n() {
				String m = "Sweety";
				return m;
			}
			
			public int i() {
				int x = 7;
				return x;
			}
}
