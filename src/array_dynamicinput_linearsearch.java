import java.util.Scanner;

public class array_dynamicinput_linearsearch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
				
	   System.out.println("enter the size of an array");
	   int size=sc.nextInt();
	   
	   int [] arr=new int[size];                              //create emptyarray
	   
	   
	   
	   System.out.println("enter the array element");
	   for(int i=0; i<arr.length; i++)
	   {
		   arr[i]=sc.nextInt();                           //adding elements to array
	   }
	   
	   //above methods just to create array with valuse
	   
	   
	   System.out.println("enter the element of linear search");
	   int find=sc.nextInt();                          //to linear search
	   
	   for(int i=0; i<arr.length; i++)                   //compare the values with arrayelement and linear search
	   {
		   if(arr[i]==find)
		   {
			   System.out.println("yes i foundit");
		   }
	   }


	}
}
	
