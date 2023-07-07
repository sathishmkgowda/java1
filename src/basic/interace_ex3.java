package basic;


interface puma
{
	void bags();
}

interface nike extends puma
{
	void shoes();	
}

class rajoutlets implements nike
{

	@Override
	public void bags() {
		// TODO Auto-generated method stub
		System.out.println("sakathagide");
	}

	@Override
	public void shoes() {
		// TODO Auto-generated method stub
		System.out.println("chee chenagilla");
	}
	
}
public class interace_ex3 
{
	public static void main(String[] args) 
	{
		rajoutlets r = new rajoutlets();
		r.bags();
		r.shoes();
		
	}

}
