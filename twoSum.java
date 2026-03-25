//Here I need to find the index of the values that give the target by adding them 
public class twoSum {
    public static void main(String[] args) {
        int arr[]={2,5,8,9};
        int target=10;
        int n=arr.length;
        int comp=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]<=target)
            {
                comp=target-arr[i];
            }
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]==comp && i!=j)
                {
                    System.out.print("["+i+","+j+"]");
                }
            }
        }

    }
}
