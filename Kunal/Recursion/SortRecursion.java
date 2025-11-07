package Kunal.Recursion;

public class SortRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-1,-3 };
        sort(arr,arr.length, 0);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void sort(int[] arr, int n, int i) {
        if(n == 0)return;
        if(i < arr.length - 1 && arr[i] > arr[i + 1] ) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        if(i < arr.length - 1) {
            sort(arr, n,i+1);
        } else {
            sort(arr, n - 1, 0);
        }

    }
}
