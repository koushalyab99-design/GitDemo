package coreJava;

public class Firstclass {
	static int a = 4;
	
	public int getData()
	{
		return a +5;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 5;
		 Firstclass ob =new Firstclass();
		 Secondclass sn= new Secondclass();

		
		System.out.println(ob.getData());
		System.out.println(ob.a);
		System.out.println(a);
		sn.setData();
		
		
		System.out.println("Hi koushalya ");
		System.out.print(" learning to code");
		
		
		

	}

}
