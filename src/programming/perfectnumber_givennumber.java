package programming;

public class perfectnumber_givennumber
{
	public static void main(String[] args) 
	{
		int no=28;
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
