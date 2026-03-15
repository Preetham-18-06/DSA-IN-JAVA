public class linearSearch {
    public static void main(String[] args) {
        int arr[]={3,5,7,9,11};
        int target=77;
        int result=linearsearch(arr,target);

        if(result!=-1)
            System.out.println("The element is found at the index: "+result);
        else 
            System.out.println("Element not found");
    }

    public static int linearsearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }

    
}
