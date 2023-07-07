package basic;

class animal
{
	void noise()
	{
		System.out.println("some noise");
	}	
}

class dog extends animal
{
	void noise()
	{
		System.out.println("bow bow bow");
	}
}

class cat extends animal
{
	void noise()
	{
		System.out.println("meow meow");
	}
}

class snake extends animal
{
	void noise()
	{
		System.out.println("buss buss");
	}
}

public class polymorphism_runtime 
{
	public static void main(String[] args) 
	{
		dog d = new dog();
		cat c = new cat();
		snake s = new snake();
		
		stimulator.ansim(d);
		stimulator.ansim(c);
		stimulator.ansim(s);
	}

}

class stimulator
{
	static void ansim(animal a)
	{
		a.noise();
	}
}
