package searchsort;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */
    @Override
    public int find(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if(target < arr[mid])
            {
                high = mid - 1;
            }else if(target > arr[mid]) {
               low = mid + 1;
            }else 
            {
                return mid;
            }

        }
        return -1;
    }

    /**
     * Find the index of the target element in the sorted array arr using binary
     * search recursively. Return -1 if target is not found in arr.
     */
    @Override
    public int recursiveFind(int[] arr, int target) {
        return 0;
    }

}
