package basic;


class punter
{
	private int x=10;
	
	public int get()
	{
		System.out.println(x);
		return x;
	}
	
	public void set(int x)
	{
		this.x=x;
		System.out.println(x);
	}
}
public class encapsulation_ex1
{
	public static void main(String[] args) 
	{
		punter p = new punter();
		p.get();
		p.set(15);	
	}

}
