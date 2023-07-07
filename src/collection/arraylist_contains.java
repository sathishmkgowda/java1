package collection;

import java.util.ArrayList;

public class arraylist_contains 
{
	public static void main(String[] args)
	{

		ArrayList a = new ArrayList<>();
		
		a.add(10);                        
		a.add("I love you");
		a.add('s');
		a.add(21.3);
		a.add(2.1f);
		a.add(true);
		
		System.out.println(a);
		
		
		        if(a.contains('s'))
				{
			       System.out.println("ideeeee");
				}
		        else
		        {
		        	System.out.println("illlaaaaaa");
		        }
	}

}
