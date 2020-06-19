
/**
 * QuickSort1 is a class for the quick sort algorithm that uses the first element as a pivot
 *
 * @author Omar Drira & Abiola Olofin
 * @version 03/12/20
 */
public class QuickSort1<E extends Comparable<E>> extends QuickSorter<E>
{
    // instance variables - replace the example below with your own
    E[]a;

    /**
     * Constructor for objects of class QuickSort
     */
   public QuickSort1(E[]a)
    {
        this.a=a;
   }

    /**
     * the method that sorts the array using the quick sort algorithm
     *
     * @param  the array to be sorted
     */
   public void qSort (E[] a) {
        qSort1(a, 0, a.length-1);
   }
   /**
     * the method that represents the recursive quick sort algorithm
     *
     * @param  the array to be sorted 
     * @param the iterator from the left
     * @param the iterator from the right
     */
   public void qSort1 (E[] a, int fst, int lst) {
        if (fst < lst) {
            int pivIndex = partition1(a, fst, lst);
            qSort1(a, fst, pivIndex-1);
            qSort1(a, pivIndex+1, lst);
        }
   }
   /**
     * the method that partitions a part of the array using the first element as a pivot
     *
     * @param  the array to be sorted 
     * @param the iterator from the left
     * @param the iterator from the right
     */
   public int partition1 (E[] a, int fst, int lst) {
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
