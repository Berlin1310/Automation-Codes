package newpackage;

public class Abhi {
	
	String s = "Pooja";
	int i = 7;
	double d = 5.5;
	static int j = 77;
	
	public void v() {
		String a = "Abhijit";
		System.out.println(a);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abhi one = new Abhi();
		System.out.println(one.s);
		System.out.println(one.i);
		System.out.println(one.d);
		System.out.println(j);
		one.v();
		System.out.println("Please Run");
		
		String M = one.s();
		System.out.println(M);
		
		int num = one.sum();
		System.out.println(num);
	}

	public String s() {
		String a = "Abhi";
		return a;
	}
	
	public int sum() {
		int x = 5;
		int y = 10;
		int z = x+y;
		return z;
	}
}
