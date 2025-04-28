package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10};
        int target = 7;
        System.out.println(linearSearch(arr,target));
    
    }

    public static int linearSearch(int[] arr, int target){
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] ==  target) return i;
        }
        return -1;
    }

}
