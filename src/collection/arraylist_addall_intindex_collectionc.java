package collection;

import java.util.ArrayList;

public class arraylist_addall_intindex_collectionc 
{
	public static void main(String[] args) 
	{
 ArrayList e = new ArrayList<>();
		 
		 e.add(10);
		 e.add("i miss u");
		 e.add('a');
		 e.add("bye");
		 
		 ArrayList f = new ArrayList<>();
		 f.add(80);
		 f.add("i hate you");
		 f.add('k');
		 f.add("hi");
	
		 System.out.println(e);
		 
		 System.out.println(f);
		 
		 
		 //its used to add all the elements of specified collection in to another collection upon specified index of another collectiom
		 
		 e.addAll(2, f);
		 
		 System.out.println(e);
		 System.out.println(f);
		
	}

}
