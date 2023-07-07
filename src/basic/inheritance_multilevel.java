package basic;


class red
{
	void get()
	{
		System.out.println("attack");
	}
}


class yellow extends red
{
	void ready()
	{
		System.out.println("wait");
	}
}


public class inheritance_multilevel extends yellow
{
	void go()
	{
		System.out.println("conquered");
	}
	
	public static void main(String[] args) 
	{
		    inheritance_multilevel a = new inheritance_multilevel();
		    a.go();
		    a.get();
		    a.ready();
		}
}
