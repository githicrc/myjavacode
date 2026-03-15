package inheritancepkg;

public class ClassD extends ClassC {
	public static void displayD()
	{
		System.out.println("d method");
	}
public static void main(String[] args) {
		
		displayA();
		displayB();
		displayc();
		displayD();
	}

}
