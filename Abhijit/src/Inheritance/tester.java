package Inheritance;

public class tester extends Emp {
	
	double bonus;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tester t = new tester();
         t.bonus = 10000;
         t.id=1;
         t.name="Abhi";
         t.salary=85000;
         t.show();
         System.out.println(t.bonus);
	
}
}
