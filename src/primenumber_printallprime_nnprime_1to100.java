

public class primenumber_printallprime_nnprime_1to100
{
	public static void main(String[] args)
	{
		for(int j=1; j<=100; j++)
		{
		int no=j;
		int count=0;
		for(int i=1; i<=no; i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println(no+"is a prime number");
			
		}
		else
		{
			System.out.println(no+"is not a prime number");
		}
		}
		
	
		
	}

}
