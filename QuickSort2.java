import java.util.*;
/**
 * QuickSort2 is a class for the quick sort algorithm that uses a random element as a pivot
 *
 * @author Omar Drira & Abiola Olofin
 * @version 03/12/20
 */
public class QuickSort2<E extends Comparable<E>> extends QuickSorter<E>
{
    // instance variables - replace the example below with your own
    E[]a;

    /**
     * Constructor for objects of class QuickSort2
     */
    public QuickSort2(E[]a)
    {
        // initialise instance variables
        this.a=a;
    }

    /**
     * the method that sorts the array using the quick sort algorithm
     *
     * @param  the array to be sorted
     */
    public void qSort (E[]a) {
        qSort2(a, 0, a.length-1);
   }
   /**
     * the method that represents the recursive quick sort algorithm
     *
     * @param  the array to be sorted 
     * @param the iterator from the left
     * @param the iterator from the right
     */
   public void qSort2 (E[] a, int fst, int lst) {
        if (fst < lst) {
            int pivIndex = partition2(a, fst, lst);
            qSort2(a, fst, pivIndex-1);
            qSort2(a, pivIndex+1, lst);
        }
   }
   /**
     * the method that partitions a part of the array using a random element as a pivot
     *
     * @param  the array to be sorted 
     * @param the iterator from the left
     * @param the iterator from the right
     */
   public int partition2 (E[] a, int fst, int lst) {
        Random r= new Random();
        int p= fst + r.nextInt(lst-lst+1);
        
        E tmp1 = a[fst];
        a[fst] = a[p];
        a[p] = tmp1;
        E pivot = a[fst];
        int u = fst;
        int d = lst;
        do {
            while ((u < lst) &&(pivot.compareTo(a[u]) >= 0)) u++;
            while (pivot.compareTo(a[d]) < 0) d--;
            if (u < d) {
                E tmp = a[u];
                a[u] = a[d];
                a[d] = tmp;
            }
        } while (u < d);
        E tmp = a[fst];
        a[fst] = a[d];
        a[d] = tmp;
        return d;
   }
}
