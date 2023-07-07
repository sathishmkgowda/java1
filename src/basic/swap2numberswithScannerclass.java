package basic;

import java.util.Scanner;

public class swap2numberswithScannerclass
{
	public static void main(String[] args) {
		
		String s;
		String p;
		
		Scanner sw = new Scanner(System.in);
		
		System.out.println("the Strings are");
		
		s=sw.next();
		p=sw.next();
		
	String 	r=s;
	
	s=p;
	p=r;
	
	System.out.println(s);
	System.out.println(r);
		
		
		
	}

}
