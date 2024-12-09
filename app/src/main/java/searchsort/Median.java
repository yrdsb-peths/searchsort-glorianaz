package searchsort;

/**
 * The median is the middle value in an ordered integer list.
 * If the size of thelist is even,the median is the mean of the two
 * middle values.
 */
public class Median {
    /**
     * Find the median of the array arr using QuickSort algorithm.
     */
    public double findQuick(int[] arr) {
        QuickSort quick = new QuickSort();
        quick.sort(arr);

        if(arr.length == 0)
        {
            return 0.0;
        }

        int max = arr.length - 1;
        int min = 0;

        if(arr.length % 2 == 0)
        {
            return (arr[(min + max)]/ 2) + arr[(min + max) / 2 + 1] / 2.0;
        }

        return arr[(min + max) / 2];
    }

    /**
     * Find the median of the array arr using MergeSort algorithm.
     */
    public double findMerge(int[] arr) {
        MergeSort merge = new MergeSort();
        merge.sort(arr);

        if(arr.length == 0)
        {
            return 0.0;
        }

        int max = arr.length - 1;
        int min = 0;

        if(arr.length % 2 == 0)
        {
            return (arr[(min + max)] / 2 + arr[(min + max) / 2 + 1]) / 2.0;
        }

        return arr[(min + max)/ 2];
    }

    /**
     * Find the median of the array arr using InsertionSort algorithm.
     */
    public double findInsertion(int[] arr) {
        InsertionSort.sort(arr);

        if(arr.length == 0) {
            return 0.0;
        }

        int max = arr.length - 1;
        int min = 0;

        if(arr.length % 2 == 0) {
            return (arr[(min + max) / 2] + arr[(min + max) / 2 + 1]) / 2.0;
        }

        return arr[(min + max)];
    }

}
