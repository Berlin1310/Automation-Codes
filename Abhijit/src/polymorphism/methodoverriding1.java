package polymorphism;

public class methodoverriding1 extends methodoverriding{
	
	public void display(int b) {
		super.display(20);
		System.out.println("this is child class");
		System.out.println(b);
	}

	public static void main(String[] args) {

		methodoverriding1 m1 = new methodoverriding1();
		m1.display(10);
		
		//methodoverriding m = new methodoverriding();
		//m.display(25);
	}

}
