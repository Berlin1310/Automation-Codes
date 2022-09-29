package newpackage;

public class Paraconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Paraconstructor n = new  Paraconstructor("Abhijit");
		 Paraconstructor z = new  Paraconstructor(10,"Berlin");
		 Paraconstructor y = new Paraconstructor(20);
		 System.out.println("End");

	}
	 Paraconstructor(String s){
		 System.out.println(s);
	 }
	
	 Paraconstructor(int a,String x){
	 System.out.println(a+"\t"+x);
	 //System.out.println(x);
} 
	 Paraconstructor(int b){
		 System.out.println(b);
	 }
	
	}
