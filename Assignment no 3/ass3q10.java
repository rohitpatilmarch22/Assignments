import java.util.*;
class ass3q10
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=5;k>5-i;k--)
			System.out.print((char)(k+64)+" ");
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}

/*  E
   E D
  E D C
 E D C B
E D C B A*/