package Kunal.SortingAlgorithms;

public class Sorting {

    //Bubble Sorting
    public static void bubbleSort(int[] arr) {
        int count = 0;
        boolean isSwapped = false;
        for(int i = 0; i < arr.length; i++ ) {
            for(int j = 0; j < arr.length - 1; j++) {
                count++;
                if(arr[j] > arr[j + 1]) {
                    isSwapped = true;
                    swap(arr, arr[j], arr[j + 1]);
                }
            }
            if(!isSwapped) {
                break;
            }
        }
        System.out.println("No of Time loop Run : " + count);
    }

    //Selection Sorting
    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, last, maxIndex);
        }
    }

    //swaping elements in arr with index
    public static void swap(int[] arr, int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMaxIndex(int[] arr, int start , int end) {
        int max = start;
        for(int i = start; i <= end; i++) {
            if(arr[max] < arr[i]) max = i;
        }
        return max;
    }

    //Insertion Sorting
    public static void insertionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else  {
                    break;
                }
            }
        }
    }

    //Cyclic Sorting
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }


    //Bubble Sorting using Recursion
    public static void recurBubbleSort(int[] arr , int row , int col) {
        if(row == 0) return;

        if(col < row) {
            if(arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            recurBubbleSort(arr, row, col + 1);
        } else {
            recurBubbleSort(arr, row - 1, 0);
        }
    }


    //Selection Sorting using recursion
    public static void recurSelectionSort(int[] arr, int start) {
        if(start == arr.length - 1) return;
        swap(arr, start, minIndex(arr, start));
        recurSelectionSort(arr, start+=1);
    }

    public static int minIndex(int[] arr , int  start) {
        int min = start;
        while(start < arr.length) {
            if(arr[min] > arr[start]) {
                min = start;
            }
            start++;
        }

        return min;
    }

    //Merge Sorting
    public static void mergeSort(int[] arr, int s, int e) {
        if(e - s == 1) return;

        int m = (s + e)/ 2;
        mergeSort(arr, s , m);
        mergeSort(arr, m , e);

        merge(arr, s, m, e);
    }

    private static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e) {
            if(arr[i] < arr[j]) {
                mix[k] = arr[i++];
            } else {
                mix[k] = arr[j++];
            }
            k++;
        }

        while(i < m) {
            mix[k++] = arr[i++];
        }
        while(j < e) {
            mix[k++] = arr[j++];
        }

        for(int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

    //Quick Sort
    public static void quickSort(int[] arr, int low, int high) {

        if(low >= high) return;

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while(s <= e) {
            while (arr[s] < pivot) s++;
            while ((arr[e] > pivot)) e--;

            if(s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }

}
