package basic;

abstract class sample
{
	abstract void hi();
	abstract void bye();
}

class tester extends sample
{

	@Override
	void hi() 
	{
		System.out.println("naniruvude ninagagi");
	}

	@Override
	void bye() 
	{
		System.out.println("ninu iruvude namagagi");
	}
	
}

public class abstractclass_type1_ex1 
{
	public static void main(String[] args) 
	{
		tester t = new tester();
		t.hi();
		t.bye();
		
	}

}
