
public class array_smallestnumber 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,9,4,8,21,0};
		
		int smallest=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
		
	}

}
