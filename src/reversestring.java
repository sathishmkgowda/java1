
public class reversestring 
{
	public static void main(String[] args) 
	{
		String a="gadag";
		
		String reverse="";   
		
		for(int i=a.length()-1; i>=0; i--)    //for loop
		{
			reverse=reverse+a.charAt(i);     //main logic
			
		}
    	if(reverse.equals(a))        //palindrome check
		{
			System.out.println("its a palindrome");
			
		}  
		System.out.println(reverse);
		
	}
	

}
