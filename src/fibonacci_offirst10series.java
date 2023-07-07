
// wap to find the first 10 fibonacci series 
public class fibonacci_offirst10series 
{
	
	public static void main(String[] args) 
	{
		//first know the pattern of fibonacci series means 0 1 1 2 3 5 8 13 21 34 55 
		//to write fibonacci programme we need two initial data fib1=0, and fib2=1
		int fib1=0;       
		int fib2=1;
		int fib3;
		
		for(int i=1; i<=10; i++)    //for loop to repeat the same process
		{
			fib3=fib2+fib1;         //main logic
			fib1=fib2;              //for next cycle this is fib1
			fib2=fib3;	            //for next cycle  this  is fib2
			System.out.println(fib3);
		}
		
		
	}

}
