public class quickSort {
    public static void main(String[] args) {
        
        int arr[]={2,52,99,9,7,1,6,8};
         for(int nums:arr)
        {
            System.out.print(nums+" ");
        }
        System.out.println();
        quicksort(arr,0,arr.length-1);

        for(int nums:arr)
        {
            System.out.print(nums+" ");
        }
    }

    public static void quicksort(int[] arr, int low, int high) {
        
        if(low<high)
        {
            int pi=partiton(arr,low,high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }

    public static int partiton(int arr[], int low, int high) {
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        
        
        return i+1;
    }
}
