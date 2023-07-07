package maps;

import java.util.LinkedHashMap;

public class linkedhashmap                //follow order of insertion
{
	public static void main(String[] args) 
	{
		    LinkedHashMap<String, Integer> l = new LinkedHashMap<String, Integer>();
		    l.put("simmi", 123);
	         l.put("shanthi", 143);
	         l.put("shaman", 8);
	         l.put("pavu", 1234);
	         
	         System.out.println(l);
		
	}

}
