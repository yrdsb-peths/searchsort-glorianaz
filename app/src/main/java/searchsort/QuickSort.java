package searchsort;

public class QuickSort extends Sort {
    /**
     * Sort the array arr using quick sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        Util.shuffle(arr, null);
        quickSort(arr, 0, arr.length - 1);
    
    }

    /*
     * Sort the subarray arr[low..high] using quick sort algorithm.
     */
    private void quickSort(int[] arr, int low, int high) {
        if(low < high)
        {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
       
    }

    /*
     * Partition the subarray arr[low..high] using the last element as pivot.
     * Return the index of the pivot element after partition.
     */
    private int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int elem = arr[high];
     
        for (int j = low; j < high; j++) {
            if (arr[j] <= elem) {
                i++; 

                Util.exch(arr, i, j);
            }
        }
        Util.exch(arr, i + 1, high);

        return i + 1;
    }

}
