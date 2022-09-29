package Inheritance;

public class puppy extends Dog{
	
	
	public void cute() {
		System.out.println("cutiepie");
	}

	public static void main(String[] args) {
		
		System.out.println("I am in puppy class");
		puppy p = new puppy();
		
		p.name = "Berlin";
		p.age = 2;
		p.wild();
		
		p.colour = "Brown";
		p.pet();
		
		p.cute();
				
	}

}
