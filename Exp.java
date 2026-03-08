import java.util.Scanner;

public class Exp
{
    
    public static void power(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x=sc.nextInt();
        int result=1;
        for(int i=1;i<=n;i++)
        {
            result=result*x;
        }
        System.out.println("The result of "+x+" to the power of "+ n +" is "+result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        power(n);

    }
}