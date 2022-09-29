package polymorphism;

public class Superkey1 extends Superkey{

	Superkey1 (int b){
		super(25);
		System.out.println("Child class");
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Superkey1 s = new Superkey1(20);

	}

}
 