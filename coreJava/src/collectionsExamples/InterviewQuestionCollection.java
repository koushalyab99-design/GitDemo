package collectionsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InterviewQuestionCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Given an array arr=[4,5,5,5,4,6,6,9,4] print unique numbers with the number
		 * of times repeated
		 */
		
		int a[]= {4,5,5,5,4,6,6,9,4};
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int k=1;
		for(int i=0;i<a.length;i++)
		{
			//int k=1;
			if (!arr.contains(a[i]))
			{
				arr.add(a[i]);
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]==a[i])
						k++;
				}
				System.out.println(a[i] +" is repeated "+ k+ " times");
				
			}
			
			
		}
		System.out.println("unique number: "+ arr);
		
	}

}
