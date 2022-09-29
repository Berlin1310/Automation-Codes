package newpackage;

public class ThisConstructor {
	
	int a;
	String s;
	double d;
	
	ThisConstructor(int a,String s,double d){
		this.a=a;
		this.s=s;
		this.d=d;	
	}
	public void show() {
		System.out.println(a+"\t"+s+"\t"+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructor t = new ThisConstructor(10,"Abhi",2000);
		t.show();
		//System.out.println(t.a+"\t"+t.s+"\t"+t.d);
		ThisConstructor t1 = new ThisConstructor(15,"Pooja",10000);
		t1.show();
	}

}
