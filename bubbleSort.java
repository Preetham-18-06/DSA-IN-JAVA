public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={5,2,9,4,7,2};
        int size=arr.length;
        int temp=0;

        System.out.println("Before sorting: ");
        for(int array:arr)
            System.out.print(array+" ");

        System.out.println();


        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            
            }
                for(int array:arr)
            System.out.print(array+" ");
        System.out.println();
        }
        System.out.println("After sorting: ");
        for(int array:arr)
            System.out.print(array+" ");

    }


}
