package abstraction;

public class I2implement implements I1,I2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I2implement x = new I2implement();
		x.display();
		x.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(d);
		System.out.println(i);
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(s);
		System.out.println(a);
		System.out.println(t);
		
	}

}
