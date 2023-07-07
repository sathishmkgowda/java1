
public class array_remove_duplicates_instring 
{
	public static void main(String[] args) 
	{
		String a="karnataka";
		
		char[] arr=a.toCharArray();   //converting string to character array
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]='m';
				}
			}
		}
		
		for(int k=0; k<arr.length; k++)
		{
			if(arr[k]!='m')
			{
				System.out.print(arr[k]);
			}
		}
		
	}

}
