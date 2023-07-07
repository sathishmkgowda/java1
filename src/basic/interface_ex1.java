package basic;

abstract interface nivu
{
	public abstract void hi();
	public abstract void bye();
}

class navu implements nivu
{

	@Override
	public void hi() {
		System.out.println("mungaru maleye");
	}

	@Override
	public void bye() {
		System.out.println("enu ninna anigala leele");
	}
	
}

public class interface_ex1
{
	public static void main(String[] args) 
	{
		navu d = new navu();
		d.hi();
		d.bye();
		
	}

}
