package concepts;

public class splitfunctions_ofthegiven_string_ex1
{
	public static void main(String[] args) 
	{
		String s1 = "nanna manasalli ninge jaga illa";
		
		         String[] arr=s1.split(" ");
		         
		         for(int i=arr.length-1; i>=0; i--)
		         {
		        	 System.out.print(arr[i]);
		         }
		
	}

}
