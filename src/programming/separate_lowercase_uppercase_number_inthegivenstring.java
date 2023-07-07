package programming;
import java.util.*;
import java.lang.*;

 class separate_lowercase_uppercase_number_inthegivenstring 
{
	public static void main(String[] args) 
	{
		String s="#pM@e1#2th";
		
		String a="";
		String b="";
		String c="";
		String d="";
		
		for(int i=0; i<=s.length()-1; i++)
		{
		  	char ch = s.charAt(i);
		  	
		  	if(Character.isLowerCase(ch))
		  	{
		  		a=a+ch;
		  	}
		  	else if (Character.isUpperCase(ch))
		  	{
				b=b+ch;
			}
		  	
		  	else if (Character.isDigit(ch))
		  	{
		  		c=c+ch;
		  	}
		  	else
		  	{
		  		d=d+ch;
		  	}
		}
		
	}

}
