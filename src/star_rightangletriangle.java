
public class star_rightangletriangle 
{
	public static void main(String[] args) 
	{
		int star=1;
		int space=1;
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.println(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");	
			}
			star++;
			space--;
			System.out.println();
		}
		
	}
	}




