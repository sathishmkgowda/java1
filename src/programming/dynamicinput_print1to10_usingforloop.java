package programming;

import java.util.Scanner;

public class dynamicinput_print1to10_usingforloop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the starting no");
		int start=sc.nextInt();  //nextint will accept integer data
		
		// String key = sc.next();   it will accept string withoutspace
	  //  String key1 = sc.nextLine(); string allows space in dynamic statement
		
		
		System.out.println("enter the ending no");
		int end=sc.nextInt();
		
		for(int i=start; i<=end; i++)
	{
		System.out.println(i);
	}
		
	}

}
