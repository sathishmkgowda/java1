package programming;

public class palindrome_checkthenumber 
{
	public static void main(String[] args) 
	{
		int no=145;
		int sum=0;
		int copy=no;
		
		while(no!=0)
		{
			int rem=no%10;
			sum=(sum*10)+rem;
			no=no/10;
			
		}
		
		if(copy==sum)
		{
			System.out.println("its a palindrome number");
		}
		else
		{
			System.out.println("its not a palindrome");
		}
		
	}

}
