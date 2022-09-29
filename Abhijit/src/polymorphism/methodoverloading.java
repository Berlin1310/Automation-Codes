package polymorphism;

public class methodoverloading {
	
	public void show() {
		System.out.println("One");
	}
	public void show(int a) {
		System.out.println("a"+"=" +a);
	}
	public void show(char b) {
		System.out.println("b"+"="+'B');
	}
	public void show(int c,char d) {
		System.out.println("c"+"="+c+ " d="+'D');
	}

	public static void main(String[] args) {
       
		methodoverloading m = new methodoverloading();
		m.show();
		m.show(10);
		m.show('B');
		m.show(20,'D');
	}

}
