package basic;

class whatsppp
{
	void send(int no)
	{
		System.out.println(no);
	}
	
	void send(int no,String msg)
	{
	  System.out.println(no+"   "+msg);	
	}
	
	void send(String msg,int no)
	{
		System.out.println(msg+"  "+no);
	}
	
	void send(String msg)
	{
		System.out.println(msg);
	}
}

public class polymorphism_compiletime 
{
	public static void main(String[] args) 
	{
		whatsppp w1 = new whatsppp();
		w1.send(123);
		w1.send("hii");
		w1.send(123, " i will make it");
		w1.send("its yourlife man", 1234);
		
	}

}
