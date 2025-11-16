package coreJava;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= new int[5];
		int b[] = {1,2,3,4,5,6,7,8,9,0};
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
		System.out.println(a[(a.length)-1]);
		
		
		
	}

}
