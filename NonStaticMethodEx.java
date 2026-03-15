package pkg2;

import pkg1.NonStaticMethodOfDiffentPkg;

public class NonStaticMethodEx {

	public static void main(String[] args) {
		NonStaticMethodEx ref1=new NonStaticMethodEx();
		NonstaticmethodDifferntClassSamePkg ref2=new NonstaticmethodDifferntClassSamePkg();
		NonStaticMethodOfDiffentPkg ref3=new NonStaticMethodOfDiffentPkg();
		ref3.displayNS();
		ref1.login();
		ref2.showNonStaticMethod();
		//if we need to call non static method of same class then we need to create object
	}
	void login()
	{
		System.out.println("login of non static method");
		
	}

}
