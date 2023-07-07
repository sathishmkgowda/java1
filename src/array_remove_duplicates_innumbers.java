//Remove duplicates in array

public class array_remove_duplicates_innumbers 
{
	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,3,2,1,5,8,8,9};
		
		for(int i=0; i<arr.length; i++)         //1st for loop
		{
			for(int j=i+1; j<arr.length; j++)  //2nd for loop here j=i+1 is very important main logic
			{
				if(arr[i]==arr[j])            //condition 1st element value = to 2nd element value  
				{
					arr[j]=007;               //then replace the 2 number into dummy number
				}
			}
		}
		
		
		for(int k=0; k<arr.length; k++)
		{
			if(arr[k]!=007)                  // to remove the dummy number
			{
				System.out.print(arr[k]);
			}
		}
	}


}
