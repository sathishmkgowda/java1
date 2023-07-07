package programming;

public class sumoffactorial_ofeachdigit_inthe_givennumber 
{
	public static void main(String[] args) 
	{
		int no=145;
		int copy=no;
		int sum=0;
		
		while(no!=0)
		{
			int rem=no%10;
			int fact=1;
			
			for(int i=rem; i>=1; i--)
			{
				fact=fact*i;		
			}
			
			sum=sum+fact;
			no=no/10;
			
		}
		
		if(sum==copy)
		{
			System.out.println(sum+"is a armstrong number");
		}
		else
		{
			System.out.println(sum+"is not a armstrong number");
		}
		
	}

}
