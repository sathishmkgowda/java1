package collection;

import java.util.LinkedList;

public class linkedlist_peek 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList<>();
		l.add(10);
		 l.add("i miss u");
		 l.add('a');
		 l.add("bye");
	
		 System.out.println(l);
		 
		System.out.println(l.peek());
		System.out.println(l);
	}

}
