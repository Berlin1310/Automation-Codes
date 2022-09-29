package abstraction;

public class I3I2implent implements I3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I3I2implent m = new I3I2implent();
		m.display();
		m.print();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(d);
		System.out.println(i);
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(t);
		
	}

}
