package coreJava;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		
		int a[][]={ {11,12,6},{5,6,8},{9,2,3}};
		
		/*for (i=0;i<=1;i++)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}*/
		int b= a[0][0];
		int max = 0;
		int mincolumn=0;
		int maxnum=0;
		int minnum=0;
		for (int i=0;i<=2;i++)
		{
			for( int j=0;j<=2;j++)
			{
				
				if(b>=a[i][j])
				{
					b=a[i][j];
					mincolumn = j;
				    minnum = b;
				}		
                	
			}
			
			
			
		}
		System.out.println("smallest number in array is "+" "+ minnum );
		System.out.println("Column of the smallest number " + mincolumn );
		
		for(int k=0;k<=2;k++)
		{
			if (b<a[k][mincolumn])
			{
			 b=a[k][mincolumn];
			 maxnum=b;
			}
		}
		System.out.println("Biggest number in the column of the smallest number  "+ maxnum );
		
		
		
		
	//	System.out.println("Maximum number in the column of smallest number"+ max);
	/*
	 * System.out.println("smallest number in array is"+" "+ b + column); for(int
	 * k=0;k<=2;k++) { if(a[k][j]>=b)
	 * 
	 * { max=a[k][j];
	 * 
	 * } }
	 */
		//System.out.println("column of the smallest number "+ j );
		

	}
	/*
	 * for (i=0;i<=2;i++) { for(j=0;j<=2;j++) {
	 * 
	 * if(b>a[i][j]) { b=a[i][j]; }
	 * 
	 * 
	 * }
	 * 
	 * }
	 */
	
	

	}


