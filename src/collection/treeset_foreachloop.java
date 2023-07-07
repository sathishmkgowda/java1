package collection;

import java.util.TreeSet;

public class treeset_foreachloop 
{
	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet<>();
		t.add("hi");
		t.add("hello");
		t.add("rammana");
		t.add("maharshi");
		
		
		for(Object x:t)
		{
			System.out.println(x);
		}
	}

}
