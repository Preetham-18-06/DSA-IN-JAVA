public class insertionSort{
    public static void main(String[] args) {
        int key=0;
        int[] arr={9,5,2,7,3,4,6};
        int n=arr.length;
        System.out.println("Before Sorting: ");
        for(int nums:arr)
        {
            System.out.print(nums+" ");
        }
        System.out.println();

        for(int i=1;i<n;i++)
        {
            key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

            for(int nums:arr)
        {
            System.out.print(nums+" ");
        }
        System.out.println();
        }
        System.out.println("After Sorting: ");
         for(int nums:arr)
        {
            System.out.print(nums+" ");
        }
        System.out.println();
    }
}