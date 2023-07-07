package programming;

public class armstrong_ofthe_givennumber
{
	public static void main(String[] args) 
	{
		int no=153;
		int copy=no;
		int sum=0;
	   int rem;
		
		while(no!=0)
		{
		    rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		
		if(sum==copy)
		{
			System.out.println(sum+"is a armstrong no");
		}
		else
		{
			System.out.println(sum+"is not a armstrong no");
		}
		
	}

}
