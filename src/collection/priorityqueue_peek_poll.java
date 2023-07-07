package collection;

import java.util.PriorityQueue;

public class priorityqueue_peek_poll
{
	public static void main(String[] args)
	{
		
		 PriorityQueue p = new PriorityQueue<>();
		 p.add(10);
		 p.add(13);
		 p.add(6);
		 p.add(50);
		 p.add(8);
		 
		 System.out.println(p);
		 
		 System.out.println(p.peek());
		 
		 System.out.println(p);
		 
		 System.out.println(p.poll());
		 System.out.println(p);
		
		
	}

}
