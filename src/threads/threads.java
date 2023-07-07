package threads;


//wap to non synchronized multi threading


class sample extends threads implements Runnable  
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
		
			}
		}
	}
	
}

class demo extends threads implements Runnable
{
	public void run()
	{
		for(int i=100; i<=110; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
		
			}
		}
		
	}
}

public class threads
{
	public static void main(String[] args)
	{
		sample s = new sample();
		Thread t1 = new Thread(s);
		t1.start();
		
		demo   d=new demo();
		Thread t2 = new Thread(d);
		t2.start();
	}
}