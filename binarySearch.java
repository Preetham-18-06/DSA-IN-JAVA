public class binarySearch {
    public static void main(String[] args) {
        int arr[]={3,5,7,9,11};
        int target=11;

        int result=binarysearch(arr,target);

        if(result!=-1)
            System.out.println("Element found in the index: "+result);
        else 
            System.out.println("Element not found");
    }

    public static int binarysearch(int arr[],int target)
    {
        int left=0;
        int right=arr.length-1;

        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==target)
                return mid;
            else if (arr[mid]<target) {
                left=mid+1;
            }
            else
                right=mid-1;
        }



        return -1;
    }
}
