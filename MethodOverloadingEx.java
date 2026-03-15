package pkg2;

public class MethodOverloadingEx {

	public static void main(String[] args) {
		add();
		add(4,5);
		add(78,90);
		MethodOverloadingEx mov=new MethodOverloadingEx();
		mov.add(67, 7.9f,89);

	}
	void add(int a,float b, double c)
	{
		System.out.println(a+b+c)	;
	}
	static void add()
	{
		int x,y;
		x=10;
		y=30;
		int c=x+y;
		System.out.println(c);
	}
	
static void add(int y,int x)
{
	System.out.println(y+x);
}
static void add(double y,int x)
{
	System.out.println(y+x);
}
}
