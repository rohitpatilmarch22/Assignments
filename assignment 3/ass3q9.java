import java.util.*;
class ass3q9
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{System.out.print(" "+(char)(i+64)+" ");}
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}


/*       A
    B  B
   C  C  C
  D  D  D  D
 E  E  E  E  E  */