package searchsort;

public class QuickSort extends Sort {
    /**
     * Sort the array arr using quick sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++)
        {
            int minIndex = i;

            for(int j = i + 1; j < n; j++)
            {
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    
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
            while(arr[++1] < arr[low])
            {
                if(j == low)
                {
                    break;
                }
            }

            while(arr[--j] > arr[low])
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
