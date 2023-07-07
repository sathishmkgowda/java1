package threads;


public class garbagecollection
{
	public void finalize()
	{
		System.out.println("gudisu");
	}
	
	public static void main(String[] args)
	{
garbagecollection p1=new garbagecollection();
garbagecollection p2=new garbagecollection();
garbagecollection p3=new garbagecollection();

p1=null;
p2=null;
p3=null;

System.gc();

		
	}

}
