package Kunal.Recursion;

import java.util.Scanner;

// Recursion in Arrays
public class ArrayRecursion {
    public Scanner scannr = new Scanner(System.in);
    public static void main(String[] args) {

//        //1. is array sorted
//        System.out.println(isArraySorted(new int[] {1,3,5,4,5,5}, 0));

        //2.Linear Search
        System.out.println(linearSearch(new int[]{1,2,3,45,5}, 4, 0));

    }

    // This function checks whether the array is sorted or not
    public static boolean isArraySorted(int[] arr, int index) {
        if(index == arr.length - 1) return true;
        return arr[index] <= arr[index + 1] && isArraySorted(arr, index + 1);
    }

    // Find the target element is present in the array using Linear Search
    public static boolean linearSearch(int[] arr, int target, int index) {
        if(index == arr.length) return false;
        return arr[index] == target || linearSearch(arr, target, index+=1);
    }
}
