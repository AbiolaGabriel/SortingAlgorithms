import java.util.*;
/**
 * MergeSort is a class for the merge sort algorithm
 *
 * @author Omar Drira & Abiola Olofin
 * @version 03/12/20
 */
public class MergeSort<E extends Comparable<E>> implements Sorter<E>
{
    // instance variables - replace the example below with your own
    E[]a;

    /**
     * Constructor for objects of class MergeSort
     */
    public MergeSort(E[]a)
    {
        // initialise instance variables
        this.a=a;
    }
    /**
     * the method that sorts the array using the merge sort algorithm
     *
     * @param  the array to be sorted
     */
    public void sort(E[] a) {
        sortHelper(a,0,a.length-1);
    }

    /**
     * the method that constitutes the recursive merge sort algorithm
     *
     * @param  the array to be sorted 
     * @param the start of the part to be sorted
     * @param the end of the part to be sorted
     */
    public void sortHelper (E[] a, int start, int end) {
        if (start >= end) return;
        int half = (start+end) / 2;
        sortHelper(a, start, half);
        sortHelper(a, half+1, end);
        
        merge(a, start, half, end); 
    }
    /**
     * the method that merges two sorted parts
     *
     * @param  the array to be sorted 
     * @param the start 
     * @param the end 
     * @param the middle
     */
    public void merge(E[] a, int start, int half, int end) {
        E[] b = Arrays.copyOfRange(a, start, half+1);
        int i = 0; // index in b
        int j = half+1; // index in second half of a
        int k = start; // index in merged a
        while (i < b.length && j <= end )
            if (b[i].compareTo(a[j]) <= 0)
                a[k++] = b[i++];
            else
                a[k++] = a[j++];
        while (i < b.length) a[k++] = b[i++];
    }    
}

