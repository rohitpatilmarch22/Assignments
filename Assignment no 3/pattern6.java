import java.lang.*;
class pattern6
{
	public static void main(String args[])
	{
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<(2*i);k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}

/*   *********
      *******
       *****
        ***
         *      */