//This is my brute force approach where I didn't see any code 
//Selection Sort technique which reduces the no. of swapping than the bubble sort 
public class selectionSort {
    public static void main(String[] args) {

        int[] arr={2,9,6,4,1,3,7};
        int n=arr.length;
        System.out.println("Before Sorting: ");
        for(int nums:arr)
            System.out.print(nums+" "); 
        System.out.println();
        System.out.println("After Sorting: ");
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=0;j<n-1;j++)
            {
                if(arr[min]<arr[j])
                {
                    int temp=arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int nums:arr)
            System.out.print(nums+" "); 
    }


}
