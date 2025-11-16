package constructordemo;

public class ParameterizedConstructor {

	public ParameterizedConstructor(int a , int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public ParameterizedConstructor(String str)
	{
		System.out.println(str);
		System.out.println(str + " second line");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedConstructor pc = new ParameterizedConstructor(10, 11);
		ParameterizedConstructor pc1 = new ParameterizedConstructor("hi this is a string");

	}

}
