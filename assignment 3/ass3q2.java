import java.lang.*;
class ass3q2
       {
	     public static void main(String [] args)
	      {  char ch='A';
		  for (int i=1;i<=5;i++)//row
			  {
		  
		      for(int j=1;j<=i;j++) //column
			     {
				 System.out.print(ch++);
			     }
				 ch= 'A';
			   System.out.println();
			  }
			}
		 }
		 
	    	 /*A
            AB
            ABC
            ABCD
            ABCDE*/