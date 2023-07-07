package programming;

public class sum_ofevendigits_inthe_givennumber 
{
	public static void main(String[] args)
	{
		int no=84265;
		int sum=0;

		
		while(no!=0)
		{
			int rem=no%10;
			if(rem/2==0)
			{
				sum=sum+rem;
				
				System.out.println(sum);
				
			}
			no=no/10;
			
		}
		System.out.println(sum);
	}

}
