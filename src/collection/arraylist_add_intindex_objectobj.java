package collection;

import java.util.ArrayList;

public class arraylist_add_intindex_objectobj 
{
	public static void main(String[] args) 
	
	{
		ArrayList b = new ArrayList<>();
		
		b.add(2);
		b.add(3);
		b.add(4);
        b.add(5);
        
        System.out.println(b);
        
        
		b.add(2, "hello");      //its used add element inthe collection at specified index
		
		System.out.println(b);
		
		
	}

}
