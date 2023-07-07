import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import maps.hashmap;

public class remove_duplicates_usingcollection_or_map {

	public static void main(String[] args) 
	{
		String [] arr= {"hi","hello","mallaya","hi"};
		
	 Map<String, Integer> m = new HashMap<String,Integer>();
	 
	 for(String a:arr)
	 {
		 if(!m.containsKey(a))
		 {
			 m.put(a, 1);
		 }
		 else
		 {
			 int count=m.get(a);
			 m.put(a, count+1);
		 }
		 for(Entry<String, Integer>o:m.entrySet())
		 {
			 System.out.println(o.getKey()+" "+o.getValue());
		 }
	 }
		
	}

}
