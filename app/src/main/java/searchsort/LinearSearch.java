package searchsort;

public class LinearSearch {
    /**
     * Find the index of the target element in the array arr using linear search.
     * Return -1 if target is not found in arr.
     */
    public static int find(int[] arr, int target) {
        // iterate through the array 
        for(int i = 0l i < arr.length; i++)
        {
            if(arr[i] == tagret)
            {
                // returning index if target is found
                return i;
            }
        }
        // returning -1 if target isnt found
        return -1;
    }
}
