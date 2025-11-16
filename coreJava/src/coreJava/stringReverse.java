package coreJava;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String a= "kousi";
     String b ="";
     
     for(int i= a.length()-1; i>=0; i--)
     {
    	 b=b+ a.charAt(i);
     }
     
     System.out.println(b);
     
     if(b.equals(a))
         {
    	 System.out.println("a is a palindrome");}
    	 
     else
    	 System.out.println("a is not a palindrome");
     
     
     
	}

}
