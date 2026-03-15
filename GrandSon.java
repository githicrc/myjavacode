package inheritancepkg;

public class GrandSon extends Son{
	static void showGrandSon()
	{
		System.out.println("grand son");
	}
	public static void main(String[] args) {
		
		showGrandSon();
		showSon();
		showFather();
	}
}
