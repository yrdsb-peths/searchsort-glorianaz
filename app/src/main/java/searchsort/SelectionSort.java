package searchsort;

public class SelectionSort {
    /**
     * Sort the array arr using selection sort algorithm.
     */
    public static void sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int index = i;

            for(int j = i; j < arr.length; j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }
            Util.exch(arr, i, index);
        }
    }
}
