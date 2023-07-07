package concepts;

public class spiltfunctions_ofthegiven_string_ex2 
{
	public static void main(String[] args)
	{
		String s1="nanna manasali ninge jaga illa";
		
		String[] arr=s1.split(" ");
		
		for(int i=arr.length-1; i>=0; i--)
		{
			if(i==(arr.length/2))
			{
				String s=arr[i];
				String rev="";
				
				for(int j=s.length()-1; j>=0; j--)
				{
					rev=rev+s.charAt(j);
					
				}
				System.out.println(rev+" ");
			}
			else
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
