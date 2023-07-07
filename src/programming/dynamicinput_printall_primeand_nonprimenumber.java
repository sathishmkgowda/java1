package programming;

import java.util.Scanner;

public class dynamicinput_printall_primeand_nonprimenumber
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("starting number");
		int start = sc.nextInt();
		
		System.out.println("ending number");
		int end = sc.nextInt();
		
		
		for(int j=start; j<=end; j++)
		{
		int no=j;
		int count=0;
		for(int i=1; i<=no; i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println(no+"is a prime number");
			
		}
		else
		{
			System.out.println(no+"is not a prime number");
		}
		}
		
	}

}
