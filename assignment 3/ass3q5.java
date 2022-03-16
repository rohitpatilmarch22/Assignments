import java.lang.*;
class ass3q5
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(i+64)+" ");
			}
			System.out.println();
		}
		
	}
}
/*  A
 B  B
 C  C  C
 D  D  D  D
 E  E  E  E  E */