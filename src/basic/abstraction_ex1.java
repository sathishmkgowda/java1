package basic;

interface animal1
{
	void noise();	
}

class dog1 implements animal1
{
	public void noise()
	{
		System.out.println("bow bow bow");
	}
}

class cat1 implements animal1
{
	public void noise()
	{
		System.out.println("meow meow");
	}
}

class snake1 implements animal1
{
	public void noise()
	{
		System.out.println("buss buss");
	}
}

public class abstraction_ex1 
{
	public static void main(String[] args) 
	{
		dog1 d = new dog1();
		cat1 c = new cat1();
		snake1 s = new snake1();
		
		stimulator1.ansim(d);
		stimulator1.ansim(c);
		stimulator1.ansim(s);
		
	}
	

}
class stimulator1
{
	static void ansim(animal1 a)
	{
		a.noise();
	}
}
