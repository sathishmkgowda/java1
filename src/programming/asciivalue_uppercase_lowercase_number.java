package programming;

public class asciivalue_uppercase_lowercase_number
{
	
	public static void main(String[] args)
	{
		
		//first approach
		System.out.println("for uppercase");
		for(int i=65; i<=90; i++)
		{
			System.out.print((char)i);                 //integer character typecasting
		}
		
		
		
		System.out.println("for lowercase");
		for(int i=97; i<=122; i++)
		{
			System.out.print((char)i);                //integer character typecasting
		}
		
		
		System.out.println("for numbers");
		for(int i=48; i<=57; i++)
		{
			System.out.print((char)i);                //integer character typecasting
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//2ndapproach
		
		
		System.out.println("for  uppercaseletter");
		for(char ch=65; ch<=90; ch++)
		{
			System.out.print(ch);                 
		}
		
		
		
		System.out.println("for lowercase");
		for(char ch=97; ch<=122; ch++)
		{
			System.out.print(ch);                
		}
		
		
		System.out.println("for numbers");
		for(char ch=48; ch<=57; ch++)
		{
			System.out.print(ch);                
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//example of both character to integer typecasting and also character to intger typecasting ex
		System.out.println("for  uppercaseletter");
		for(char ch=65; ch<=90; ch++)
		{
			System.out.println(ch+"-----is----"+(int)ch);                 
		}
		
		
		
		
		
	}

	
	
}
