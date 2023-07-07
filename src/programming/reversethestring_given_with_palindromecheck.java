package programming;

public class reversethestring_given_with_palindromecheck
{
	public static void main(String[] args)
	{
		String a="wonderful";
		
		String rev="";
		
//		for(int i=a.length()-1; i>=0; i--)
//		{
//			rev=rev+a.charAt(i);
//			
//		}
//		
//		if(a.equals(rev))
//		{
//			System.out.println("the string is a plaindrome");
//		}
//		else 
//		{
//			System.out.println("the string is not a palindrome");
//		}
//		

		char[] arr=a.toCharArray();   //converting string to character array
		
		for(int i=8; i>=0; i--)
		{
			System.out.println(arr[i]);
		}	
		
	}

}
