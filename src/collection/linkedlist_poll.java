package collection;

import java.util.LinkedList;

public class linkedlist_poll 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList<>();
		l.add(10);
		 l.add("i miss u");
		 l.add('a');
		 l.add("bye");
	
		 System.out.println(l);
		 
		System.out.println(l.poll());
		System.out.println(l);
	}


}
