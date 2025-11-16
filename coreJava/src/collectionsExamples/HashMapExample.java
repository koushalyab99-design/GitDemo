package collectionsExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); // instead of hashmap use hashTable and only three differences
		hm.put(0, 1);
		hm.put(1, 2);
		hm.put(2, 3);
		hm.put(3, 5);
		hm.put(4, 8);
		//System.out.println(hm.get(4));
		//hm.remove(4);
		//System.out.println(hm);
		Set sn=hm.entrySet();
		Iterator it=sn.iterator();
		while(it.hasNext())
		{
		Map.Entry	me=(Map.Entry)it.next();
			System.out.println("key:"+me.getKey());
			System.out.println("Value:"+me.getValue());
		}
		

	}

}
