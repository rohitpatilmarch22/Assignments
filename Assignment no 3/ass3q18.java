import java.util.*;
class ass3q18
     {
	     public static void main(String [] args)
	      {  char ch='A';
		  for (int i=1;i<=5;i++)//row
			  {
		  
		      for(int j=5;j>=i;j--) //column
			     {
				 System.out.print(ch++);
			     }
				 ch= 'A';
			   System.out.println();
			  }
			}
		 }


/*ABCDE
  ABCD
  ABC
  AB
  A*/