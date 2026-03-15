package pkg2;

public class StaticMethodOfDIffPackage {

	public static void main(String[] args) {
		show();
		show1();

	}
	public static void show()
	{
		System.out.println("this is a static method of another class with different package");
		
	}
	public static void show1()
	{
		System.out.println("this is a static method of another class with different package1");
		show();
	}

}
