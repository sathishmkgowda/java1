package basic;

class ICICI
{
	private int atm_pin=7988;
	
	public int get_atmpin()
	{
		return atm_pin;
	}
	
	public void set_atmpin(int atm_pin)
	{
		this.atm_pin=atm_pin;
	}
}
public class encapsulation_ex2
{
	public static void main(String[] args) 
	{
		ICICI I = new ICICI();
      int b = I.get_atmpin();
      System.out.println(b);
      
      I.set_atmpin(1234);
      System.out.println(I.get_atmpin());
		
	}

}
