package collection;

import java.util.ArrayList;

public class arraylist_remove_objectobj 
{
	public static void main(String[] args) 
	{
 ArrayList e = new ArrayList<>();
		 
		 e.add(10);
		 e.add("i miss u");
		 e.add('a');
		 e.add("bye");
	
		 System.out.println(e);
		 
		 
		 
		 //to remove specified collection element
		 
		 e.remove("i miss u");
		 
		 System.out.println(e);
	}

}
