import java.util.*;
public class count{
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int n[]=new int[size];
        System.out.println("Enter the elements of array: ");
        
        for(int i=0;i<=size;i++)
        {
            n[i]=sc.nextInt();
            count++;
        }
        System.out.println("The count of a given no. is "+count);
    }
}