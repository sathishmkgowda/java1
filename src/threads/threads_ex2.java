package threads;

class demo1 extends threads_ex2 implements Runnable
{
	public void run()
	{
		System.out.println("first nanu");
	}
}

class sample1 extends threads_ex2 implements Runnable
{
	public void run()
	{
		System.out.println("next nanu");
	}
}

public class threads_ex2 
{
	public static void main(String[] args) 
	{
		demo1 d = new demo1();
		Thread t1 = new Thread(d);
		t1.start();
		
		
		sample1 s = new sample1();
		Thread t2 = new Thread(s);
		t2.start();
	}
	
	

}
