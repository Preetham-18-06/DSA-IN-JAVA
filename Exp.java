/*
Program: Power of a Number

Description:
This Java program calculates the value of x raised to the power n (x^n).
The user enters the value of n in the main function and the value of x 
inside the power() method. The program multiplies x repeatedly n times 
using a loop to compute the result.

Example:
Input:
x = 2
n = 3

Output:
2 to the power of 3 is 8

Approach:
1. Read the value of n from the user.
2. Read the value of x inside the power() function.
3. Initialize result = 1.
4. Multiply result by x repeatedly for n iterations using a for loop.
5. Print the final result.

Time Complexity: O(n)
Space Complexity: O(1)

Author: Preetham
Language: Java
*/
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