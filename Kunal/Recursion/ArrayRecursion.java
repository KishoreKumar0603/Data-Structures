package Kunal.Recursion;
// Recursion in Arrays
public class ArrayRecursion {
    public static void main(String[] args) {
        /* 1. isSort*/
//        int[] arr = {1,2,3,4,9,6,7};
//        System.out.println(isSort(arr, 0));
        

    }

    //check the given array is sorted
    public static boolean isSort(int[] nums, int index) {
        if(index == nums.length - 1) return true;

        return nums[index] < nums[index + 1] ^ isSort(nums, index + 1);
    }
}
