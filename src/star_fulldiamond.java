
public class star_fulldiamond {

	public static void main(String[] args) 
	{
		int space=3;
		int star=1;
		for(int i=1; i<=4; i++)  
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" "); //here we close the space  bwn two invited comas it will be right  right angle triangle
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;//we e
	}
		int space1=1;
		int star1=5;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=space1; j++)
			{
				System.out.print(" "); //here we close the space  bwn two invited comas it will be right  right angle triangle
			}
			for(int k=1; k<=star1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space1++;
			star1= star1-2;
		}
	}
}