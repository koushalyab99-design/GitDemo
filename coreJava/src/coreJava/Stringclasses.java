package coreJava;

public class Stringclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String buffer is mutable
		StringBuffer sb= new StringBuffer("hello");
		sb.append(" world");
		System.out.println(sb);
		System.out.println(sb.insert(2, "she"));
		System.out.println(sb.reverse());
		
		//StringBuilder class - is not thread safe while String Buffer class is thread safe
		
		// SBuilder - not synchronized , but faster than Buffer
		
		//parallel testing - string buffer 
		//sequential testing - string builder
		
		
		// a==b compares reference
		// a.equals b compares content 
		
		
		
		

	}

}
