package collection;

import java.util.ArrayList;

public class arraylist_retainall_collectionc       //retain duplicates
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
		 
		//its used to retain all the duplicates of one collection after comparing it with specified collection
		 
		 c.retainAll(d);   //in collection c only duplicates were present
		 
		 System.out.println(c);
		 System.out.println(d);
	}

}
