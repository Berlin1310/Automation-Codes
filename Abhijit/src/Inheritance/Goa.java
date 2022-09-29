package Inheritance;

public class Goa extends India {
	
	public void beach() {
		System.out.println("Good times");
	}

	public static void main(String[] args) {
		
		Goa g = new Goa();
		g.beach();
		g.country();
		//g.state1();
		
        Maha m = new Maha();
        m.state1();
        m.country();
	}

}
