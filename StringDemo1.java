package StringMethods;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		String s="  welcome  ";
		System.out.println(s.length());
		System.out.println(s.trim());
		System.out.println(s.charAt(5));
		System.out.println(s.contains("WEL"));
		
		String s1="JAVA";
		String s2="JAVA";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.replace('A','z'));
		String s3="JAVA is powerful";
		System.out.println(s3.replace("is","was"));
		System.out.println(s1.substring(1,3));
		String s4="java@javais";
		String a[]=s4.split("@");
		System.out.println(a[0]);
		
		System.out.println(a[1]);
		System.out.println(Arrays.toString(a));
	}

}
