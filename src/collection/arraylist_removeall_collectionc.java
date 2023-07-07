package collection;

import java.util.ArrayList;

public class arraylist_removeall_collectionc      //remove duplicates
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
	 d.add("i miss u");
	 d.add('k');
	 d.add("hi");

	 System.out.println(c);
	 
	 System.out.println(d);
	 
	 //its is used to removeall the duplicate elements of one collection after comparing it with specified collection
	 
	c.removeAll(d);    //in collection c duplicates will be removed after comparing it with collection d
	
	System.out.println(c);
	System.out.println(d);
	

	}
}
