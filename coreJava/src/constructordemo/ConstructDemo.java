package constructordemo;

public class ConstructDemo {
	
	public ConstructDemo()
	{
		System.out.println("inside constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//block of code will be executed inside the constructor once the object is created for the class
// constructor is same as method but the name is class name	
//no return value	
//compiler will call default constructor if constructor is not defined		
		ConstructDemo cd=new ConstructDemo();

	}

}
