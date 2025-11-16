package exceptiondemo;

public class ExceptionClass {
// one try can have multiple catch blocks
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		int b=0;
		//int c=a/b;
		
		try
		{
			//int c=a/b;
			int arr[]=new int[5];
			System.out.println(arr[7]);
		}
		/*
		 * catch (ArithmeticException e) { System.out.println("from arithmetic block");
		 * } catch (IndexOutOfBoundsException e) {
		 * System.out.println("from index out of bound block"); } catch(Exception e) {
		 * System.out.println("failed "); }
		 */
		finally
		{
			System.out.println("delete cookies");
			//this block will be executed even if we have exception
			//when JVM is forcibly stopped - finally block will not be executed
		}
		
	}

}
