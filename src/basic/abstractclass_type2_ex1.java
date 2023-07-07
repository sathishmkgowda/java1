package basic;

abstract class aramu
{
	abstract void hi();
	void bye()
	{
		System.out.println("learn easily");
		
	}
}


class ohyess extends sample
{
	void hi()
	{
		System.out.println("learn the java easiy");
	}

	@Override
	void bye() {
		
		System.out.println("heeeeee heeeee");
		
	}

	
}
public class abstractclass_type2_ex1
{
  public static void main(String[] args) 
  {
	  
	   ohyess t = new ohyess();
	  t.hi();
	  t.bye();
	
}
}
