package coreJava;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swap without variable
		/*
		 * int a=4; int b=5;
		 * 
		 * a=a+b; b=a-b; a=a-b;
		 */
		
		
		int a[]= {8,10,11,5,2};
		int temp;
		
		for (int i=0;i<=4;i++)
		{
			for(int j=i+1;j<5;j++)
			{
			if(a[i]>a[j])
			{
	          temp = a[i];
	          a[i] = a[j];
	          a[j] = temp; 
			}
		}
			
	}
		System.out.print("sorted array:");
		for (int i=0;i<=4;i++)
		{
			System.out.print(a[i]+" ");
		}
		int minnum=a[0];
		for (int i=0;i<=4;i++)
		{
			{
			if(minnum >a[i])
			{
	          minnum= a[i];
 
			}
		}
			
	}
		System.out.println();
		System.out.println("Minimum number in sorted array "+minnum);
		
		

}
}
