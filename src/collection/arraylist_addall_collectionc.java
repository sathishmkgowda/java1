package collection;

import java.util.ArrayList;

public class arraylist_addall_collectionc 
{
	public static void main(String[] args) 
	{
		 ArrayList c = new ArrayList<>();
		 
		 c.add(10);
		 c.add("i miss u");
		 c.add('a');
		 c.add("bye");
		 
		 ArrayList d = new ArrayList<>();
		 d.add(80);
		 d.add("i hate you");
		 d.add('k');
		 d.add("hi");
	
		 System.out.println(c);
		 
		 System.out.println(d);
		 
		 
		 //add all collection is used to add all the elements of specified collection(d) into collection(c)
		
		 c.addAll(d);
		 
		 System.out.println(c);
		 System.out.println(d);
	}

}
