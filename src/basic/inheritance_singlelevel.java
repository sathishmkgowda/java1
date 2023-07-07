package basic;

class demo
{
	void ho()
	{
		System.out.println("hi thor");
	}
}

public class inheritance_singlelevel extends demo

{
	void hi()
	{
		System.out.println("hey am learning software");
	}
    public static void main(String[] args) 
    {
    	demo a = new demo();
    	
    	 a.ho();
    	 
    	 inheritance_singlelevel C = new inheritance_singlelevel();
    	 
    	 C.hi();
    		
	}

}
