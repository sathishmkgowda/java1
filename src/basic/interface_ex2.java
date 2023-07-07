package basic;

abstract interface elli
{
	public abstract void hi();
	public abstract void bye();
}

abstract class edelli implements elli
{
	public void hi()
	{
		System.out.println("---hi---");
	}
}

class raj extends edelli
{
	
	public void bye()
	{
		System.out.println("---bye----");
	}
}
public class interface_ex2 
{
	public static void main(String[] args) 
	{
		raj r = new raj();
		r.hi();
		r.bye();
		
	}

}
