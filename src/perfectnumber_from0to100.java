

public class perfectnumber_from0to100 
{
	public static void main(String[] args) 
	{
		for(int j=1; j<=100; j++)
		{
		int no=j;
		int sum=0;
		int copy=no;
		
		for(int i=1; i<no; i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
			if(sum==copy)
			{
				System.out.println(no+"is a perfect number");
			}
			else
			{
				System.out.println(no+"is not a perfect number");
		    }    
		}
	}

}
