package newpackage;

public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a = 20;
		int b = 30;
		char c = '*';
		switch(c) {
		
		case'+':
			System.out.println(a+b);
			break;
		case'-':
			System.out.println(a-b);
			break;
		case'*':
			System.out.println(a*b);
			break;
		case'/':
			System.out.println(a/b);
			break;
		case '%':
			System.out.println(a%b);
			break;
		default:
				System.out.println("Not in list");
				break;
		}

	}

}
