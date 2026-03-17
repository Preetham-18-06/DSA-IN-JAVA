public class selectionSort1 {
    public static void main(String[] args) {
        int arr[]={1,9,8,7,3,5,4};
        int n=arr.length;
        System.out.println("Before Sorting: ");
        for(int nums:arr)
        {
            System.out.print(nums+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            int min=i;

            for(int j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            
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
