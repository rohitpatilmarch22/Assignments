import java.util.*;
    class rohit5
	{
    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //125
        int b = sc.nextInt(); //24
        int sum = a + b;
        System.out.println("125+24="+sum);
        int sub = a - b;
        System.out.println("125-24="+sub);
        int product = a * b;
        System.out.println("125*24="+product);
        int quet = a / b;
        System.out.println("125/24="+quet);
        int mod = a % b;
        System.out.println("125 mod 24 ="+mod);
    }
}