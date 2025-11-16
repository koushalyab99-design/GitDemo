package streamsAndLambda;

import java.util.ArrayList;

import org.testng.annotations.Test;
@Test
public class test1 {

 public void regular()
 {
	 int k=0;
	 ArrayList<String> arr = new ArrayList<String>();
	 arr.add("Koushalya");
	 arr.add("Abinaya");
	 arr.add("Arun");
	 arr.add("Arunaya");
	 arr.add("Aruna");
	 
	 for (int i=0;i<arr.size();i++)
	 {
       String NameA=arr.get(i);
       if(NameA.startsWith("A"))
       {  
		k++;
       }
       
	 }
	 System.out.println("Number of numbers starting with A " +k);
 }

}
