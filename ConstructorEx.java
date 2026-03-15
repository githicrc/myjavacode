package pkg2;

public class ConstructorEx {
	ConstructorEx()
	{
		System.out.println("it is a non param constructor");
	}
	ConstructorEx(int a)
	{
		System.out.println("it is a  param constructor");
	}
	ConstructorEx(double a,int b)
	{
		System.out.println("it is a  param constructor 2");
	}
	public static void main(String[] args) {
		//ConstructorEx c1=new ConstructorEx();
		new ConstructorEx(1);
		
		new ConstructorEx(1,8);
		
	}

}
