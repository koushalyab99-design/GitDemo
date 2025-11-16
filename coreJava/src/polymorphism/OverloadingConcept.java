package polymorphism;

public class OverloadingConcept {
	//overloading - number of arguments and data type 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingConcept olc = new OverloadingConcept();
		olc.getData("hello");
	}
	
	public void getData(int a)
	{
		
	}
	
	public void getData(String b)
	{
		System.out.println(b);
	}
	
	public void getData(int a, int b)
	{
		
	}

}
