package superkeyword;

import inheritance.ParentbikeClass;

public class SuperkeyDemoChild extends ParentbikeClass{
	
	public SuperkeyDemoChild()
	{
		super();// always should be in first line
		
	}
    String colour = "blue";
	public void printdata()
	{
		System.out.println("child class colour is "+colour);
		System.out.println("Parent class colour is "+super.colour);
	}
	
	
	  public void Gear() {
		  super.Gear();
	  System.out.println("Implemting gear for bike - child class"); }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperkeyDemoChild skc= new SuperkeyDemoChild();
		//skc.printdata();
		skc.Gear();
		

	}

}
