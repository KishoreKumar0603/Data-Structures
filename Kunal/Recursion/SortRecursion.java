package Kunal.Recursion;

public class SortRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        bubbleSort(arr,arr.length, 0);
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void bubbleSort(int[] arr, int n, int i) {
        if(n == 0)return;
        if(i < arr.length - 1 && arr[i] > arr[i + 1] ) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        if(i < arr.length - 1) {
            bubbleSort(arr, n,i+1);
        } else {
            bubbleSort(arr, n - 1, 0);
        }
    }

    public static void quickSort(int[] arr, int low, int high ) {
        if(low >= high) return;
        int start = low;
        int end  = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while(start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(arr,low, end);
        quickSort(arr, start,high);
    }
}
