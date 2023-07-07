
public class factorial
{
	
	public static void main(String[] args) 
	{
		
		int no=7;
		int fact=1;                     // considering initial value of fact is 1
		for(int i=no; i>=1; i--)       //for loop
		{
			fact=fact*i;                //main logic
		}
		System.out.println(fact);
		
	}
}