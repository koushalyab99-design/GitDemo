package collectionsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
	    //List<Integer> arrList= Arrays.asList(arr1);
	    List<int[]> arrList = Arrays.asList(arr1);
	    
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(4);
		arr.add(6);
		arr.add(3, 9);
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);
		System.out.println(arr.get(2));
		System.out.println(arr.contains(9));
		System.out.println(arr.indexOf(9));
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());
		

	}

}
