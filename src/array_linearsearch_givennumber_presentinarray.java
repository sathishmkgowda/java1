

public class array_linearsearch_givennumber_presentinarray 
{
	public static void main(String[] args) 
	{
	
		int [] arr= {10,30,40,60,40};
		
		int find=40;
		int count=0;
		
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]==find)
			{
				System.out.println("yes i found it");
				count++;
				
			}
		
		}		
		System.out.println(count);
		
	}

}
