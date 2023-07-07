package threads;


//wap to demonstrate current thread

public class threads_ex3 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
		System.out.println(t.getPriority());
		
		t.setName("naguva nayana madura mouna");
		
		t.setPriority(7);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
	}

}
