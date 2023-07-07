package programming;

public class multipletable_from_1to100 
{
	static void table(int no)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(no+"x"+i+"="+(no*i));
		}
	}
	public static void main(String[] args)
	{
		for(int j=1; j<=100; j++)
		{
			table(j);
			System.out.println();
		}
		
	}
	
}

