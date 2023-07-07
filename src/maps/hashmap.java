package maps;

import java.util.HashMap;

public class hashmap             //it didnot follow order of insertion
{
	public static void main(String[] args) 
	{
		  HashMap<String, Integer> h = new HashMap<String, Integer>();
	         h.put("simmi", 123);
	         h.put("shanthi", 143);
	         h.put("shaman", 8);
	         h.put("pavu", 1234);
	         
	         System.out.println(h);
	}

}
