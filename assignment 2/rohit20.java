import java.util.*;
class rohit20
{ 
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double c=1,num=0;
int i=0;
long r;

System.out.println("enter the number ");
long n=sc.nextLong();
while(n>0)
{
r=n%16;
num=num+(r*c);
c=c*10;
n=n/8;

}
System.out.println("octal number is"+num);
}
}
