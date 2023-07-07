package maps;

import java.util.TreeMap;

public class treemap    //auto sorted   it sort based on ascii value
{
	public static void main(String[] args)
	{
		TreeMap<String, Integer> t = new TreeMap<String, Integer>();
		t.put("simmi", 123);
        t.put("shanthi", 143);
        t.put("shaman", 8);
        t.put("pavu", 1234);
        
        System.out.println(t);
		
	}

}
