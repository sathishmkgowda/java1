package collection;

import java.util.HashSet;

public class hashset  //will not follow order of insertion and it will not auto sorted and it will not allow duplicates
{
	public static void main(String[] args) 
	{
		HashSet h = new HashSet<>();
		h.add("hi");
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add("hello");
		h.add('s');
		
		System.out.println(h);
		
	}

}
