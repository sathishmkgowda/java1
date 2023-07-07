
public class star_halfdiamond_rightright_leftrihtangletriangle
{
	public static void main(String[] args) //half diamond
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
			star=star+2;//we enter +1 this will be left right angle triangle
		}
		
	}
}

