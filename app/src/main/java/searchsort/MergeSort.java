package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        // base case 
        if(arr.length < 2)
        {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        // recursively sort 
        sort(left);
        sort(right);
        merge(arr, left, right);
    }

    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void merge(int[] arr, int[] left, int[] right) {
        // left array
        int i = 0;
        // right array
        int j = 0;
        // merged array
        int k = 0;

        // compare elements from left and right array
        while ( i < left.length && j < right.length)
        {
            if(left[i] <= right[j])
            {
                arr[k++] = left[i++];
            }else 
            {
                arr[k++] = right[j++];
            }
        }
        // remaining elements 
        while(i < left.length)
        {
            arr[k++] = left[i++];
        }
    }


}
