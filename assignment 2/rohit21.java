 import java.util.*;
 
 public class rohit21
 {
 
 
     public static void main(String args[])
     {
     String bstr;
     int decNum;
 
     System.out.print("Enter binary string (0-1) : ");
     bstr = new Scanner(System.in).nextLine();
 
     decNum = bin2dec(bstr);
 
     if (decNum == -1)
     {
      System.out.print("Invalid string.");
     }
     else
     {
     System.out.print("Decimal number : "+decNum);
     }
 
 
     }
 
 
 
     public static int bin2dec(String binaryString)
     {
     int dnum = 0;
      int i = 0;
      int n;
 int len=binaryString.length();
 
      while (i<len){
          n=binaryString.charAt(i)-48; // convert char '0' 
            or '1' into integer 0 or 1
 
      /*check for 0 and 1 */
 
      if (n != 0 && n != 1)
      {
       return -1; // invalid string
      }
 
       dnum = (dnum * 2) + n;
       i++;
      }
 
     return (dnum);
 
     }
 
 }
