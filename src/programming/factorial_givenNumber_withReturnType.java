package programming;

public class factorial_givenNumber_withReturnType
{
	static int factorial()
	{
		int no=7;
		int fact=1;
		for(int i=no; i>=1; i--)
		{
			fact=fact*i;
		}
		return(fact);
	}

	 public static void main(String[] args) 
	 {
		 int a =factorial();
		 System.out.println(a);
		
	}
}
