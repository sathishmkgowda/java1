
public class array_largestnumber
{
	public static void main(String[] args) 
	{
		int[] arr= {1,9,4,8,21};
		
		int largest=arr[0];             
		
		for(int i=0; i<arr.length; i++) //for loop
		{
			if(arr[i]>largest)        //main logic
			{
				largest=arr[i];       //that value is replaced into largest
			}
		}
		System.out.println(largest);
		
	}

}
