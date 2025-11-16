package coreJava;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. string literal
		//2. by creating object of the string
		
		String a =" kousi is a smart girl "; // literal - creates object in backgroud
		String ab = new String("kousi"); // string class
		
		System.out.println(a.charAt(4));
		System.out.println(a.indexOf("k"));
		System.out.println(a.substring(5));
		System.out.println(a.substring(3,16));
		System.out.println(a.concat(" and she is hardworking"));
		System.out.println(a);
		System.out.println(a.trim());// trims white space before and after
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		String split[]= a.split("a");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(a.replace("k", "m"));
	}

}
