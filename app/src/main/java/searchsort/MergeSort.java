package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        // create an auxilary array for merging
        int[] aux = new int[arr.length];
        mergeSort(arr, aux, 0, arr.length - 1);
    }

    public void mergeSort(int[]arr, int[] aux, int low, int high) {
        // base case 
        if(high <= low)
        {
            return;
        }
        // Find the middle index to split the array
        int mid = (low + high) / 2;

        // recursively sorting the array
        mergeSort(arr, aux, low, high);
        mergeSort(arr, aux, mid + 1, high);

        // merge the 2 sorted halves
        merge(arr, aux, low, mid, high);
    }

    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void merge(int[] arr, int[] aux, int left, int mid, int right) {
        for(int k = left; k <= right; k++)
        {
            aux[k] = arr[k];
        }

        // initialize pointers 
        int i = left;
        int j = mid + 1;
        for(int k = left; k <= right; k++)
        {
            if(i > mid){
                arr[k] = aux[j];
                j++;
            }
            else if(j > right)
            {
                arr[k] = aux[j];
                i++;
            }
            else if (aux[j] < aux[i])
            {
                arr[k] = aux[j];
                j++;
            }
            else {
                arr[k] = aux[i];
                i++;
            }
        }
    }


}
