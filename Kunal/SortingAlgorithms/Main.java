package Kunal.SortingAlgorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int[] arr = {2,3,1,4,5};

        int[] arr = {9,8,7,6,5,4,3,2,1};
        //Bubble Sort
//        Sorting.bubbleSort(arr);

        //Selection Sort
//        Sorting.selectionSort(arr);


        //Insertion Sort
//        Sorting.insertionSort(arr);

        //Cyclic Sort
//        Sorting.cyclicSort(arr);

        //Bubble sort using Recursion
//        Sorting.recurBubbleSort(arr, arr.length - 1, 0);

        //Selection sort using Recursion
//        Sorting.recurSelectionSort(arr, 0);

        //Merge Sort
//        Sorting.mergeSort(arr,0,arr.length);

        //Quick Sort
        Sorting.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
