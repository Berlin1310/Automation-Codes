package abstraction;

public class abstraction1 extends abstraction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstraction1 b = new abstraction1();
		b.now();

	}

	@Override
	void now() {
		// TODO Auto-generated method stub
		System.out.println("Your are in abstraction class");
		System.out.println(x);
		System.out.println(d);
		
	}

}
