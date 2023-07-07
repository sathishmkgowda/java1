//ascending order of the given array
public class array_bubblesort 

{

	public static void main(String[] args) 
	{
		int[] arr= {4,8,1,2,10,3};
		
	
		for(int i=0; i<arr.length-1; i++)             //1st for loop applied for all the element
		{
			for(int j=0; j<arr.length-1; j++)        //2nd for loop  main logic for one element
			{
				if (arr[j] >arr[j+1])               //comparing with next index if its smaller then swap the two numbers
				{
					int temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int k=0; k<arr.length; k++)            //3rd for loop  for printing purpose
		{
			System.out.println(arr[k]+"  ");
		}
		
		
			 
	}
		
}




