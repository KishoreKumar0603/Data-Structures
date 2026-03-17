package Kunal.SortingAlgorithms;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int count = 0;
        boolean isSwapped = false;
        for(int i = 0; i < arr.length; i++ ) {
            for(int j = 0; j < arr.length - 1; j++) {
                count++;
                if(arr[j] > arr[j + 1]) {
                    isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(!isSwapped) {
                break;
            }
        }
        System.out.println("No of Time loop Run : " + count);
    }
}
