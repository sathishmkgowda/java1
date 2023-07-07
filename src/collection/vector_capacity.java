package collection;

import java.util.Vector;

public class vector_capacity
{
	public static void main(String[] args) 
	{
		   Vector v = new Vector<>();
		   v.add(1);
		   v.add(1, 2);
		   v.add("i see u");
		   v.add('s');
		   
		   System.out.println(v);
		   
		   
		   System.out.println(v.size());     //size of the collection
		   
		  System.out.println(v.capacity());  //by default capacity of vector is 10
		
	}

}
