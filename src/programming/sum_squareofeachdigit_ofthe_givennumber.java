package programming;

public class sum_squareofeachdigit_ofthe_givennumber
{
	public static void main(String[] args) 
	{
		int no=154326;
		int sum=0;
		
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem);
			no=no/10;	
		}
		System.out.println(sum);
		
	}

}
