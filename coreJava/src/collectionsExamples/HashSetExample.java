package collectionsExamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Koushalya");
		hs.add("Suresh");
		hs.add("jothi");
		hs.add("Balu");
		hs.add("arun");
		//System.out.println(hs);
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
