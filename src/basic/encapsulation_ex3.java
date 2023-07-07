package basic;

class facebook
{
	private int pwd=7988;
	
	public int get_pwd()
	{
		return pwd;
	}
	
	public void set_pwd(int pwd)
	{
		this.pwd=pwd;
	}
}


public class encapsulation_ex3
{
	public static void main(String[] args)
	{
	 facebook f = new facebook();
		System.out.println(f.get_pwd());
		
		f.set_pwd(4321);
		System.out.println(f.get_pwd());
	}

}
