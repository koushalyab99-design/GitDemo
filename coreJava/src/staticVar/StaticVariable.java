package staticVar;

public class StaticVariable {
    
	String name; // instance variable
	String address;
	static String city ; // accessible to all objects in the class 
	static int i;
	static
	{
		String city = " coimbatore";
		int i =0;
	}
	
	public StaticVariable(String name, String address)
	{
		this.name= name; // local variable
		this.address= address;
	}
	
	public void getData()
	{
		i++;
	  System.out.println(i+"."+name);
	  //System.out.println(name);
	  System.out.println(address + city);
	}
	
	public static void getCity() // static method accepts only static variable
	{
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable sv= new StaticVariable("kousi","saibaba colony");
		StaticVariable sv1= new StaticVariable("suresh","saibaba colony");
		sv.getData();
		sv1.getData();
		StaticVariable.getCity();// static is independent of object - so static method called by class
	}

}
