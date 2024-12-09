package searchsort;

public class QuickSort extends Sort {
    /**
     * Sort the array arr using quick sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length == 1) {
            return;
        }
        Util.shuffle(arr, null);
        quickSort(arr, 0, arr.length - 1);
    
    }

    /*
     * Sort the subarray arr[low..high] using quick sort algorithm.
     */
    private void quickSort(int[] arr, int low, int high) {
        if(high <= low)
        {
            return;
        }
        int p = partition(arr, low, high);
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
    }

    /*
     * Partition the subarray arr[low..high] using the last element as pivot.
     * Return the index of the pivot element after partition.
     */
    private int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high + 1;
        while(true)
        {
            while(i < high && arr[++i] < arr[low])
            {
                if(i == high)
                {
                    break;
                }
            }

            while(j > low && arr[--j] > arr[low])
            {
                if(j == low)
                {
                    break;
                }
            }
            if(i >= j)
            {
                break;
            }
            Util.exch(arr, i, j);
        }
        Util.exch(arr, low, j);
        return j;

    }

}
