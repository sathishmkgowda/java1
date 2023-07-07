package collection;

import java.util.ArrayList;

public class arraylist_add_objectobj 
{
	public static void main(String[] args)
	{
		ArrayList a = new ArrayList<>();
		
		a.add(10);                              //its used to add the element in the collection
		a.add("I love you");
		a.add('s');
		a.add(21.3);
		a.add(2.1f);
		a.add(true);
		
		System.out.println(a);
	}

}
