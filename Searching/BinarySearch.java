package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10};
        int target = 7;
        System.out.println(binarySearch(arr,target));
    
    }
    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        int mid;
        while (low<=high) {
            mid = (low+high)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] > target)
            {
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
            
        }
        return -1;
    }
}
