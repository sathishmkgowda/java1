package programming;

public class swap_2string_withoutusing_3rdvariable
{
	public static void main(String[] args) 
	{
		String s="hello";
		String p="world";
		
		String a=s+p;
		
		p=a.substring(0, 5);
		s=a.substring(5);
		
		
		System.out.println(s);
		System.out.println(p);
		
	}

}
