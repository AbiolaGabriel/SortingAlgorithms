
/**
 * QuickSort3 is a class for the quick sort algorithm that uses the median of the first element,
 * the middle, and the last as a pivot
 *
 * @author Omar Drira & Abiola Olofin
 * @version 03/12/20
 */
public class QuickSort3<E extends Comparable<E>> extends QuickSorter<E>
{
    // instance variables - replace the example below with your own
    E[]a;

    /**
     * Constructor for objects of class QuickSort
     */
    public QuickSort3(E[]a)
    {
        this.a=a;
    }

    /**
     * the method that sorts the array using the quick sort algorithm
     *
     * @param  the array to be sorted
     */
    public void qSort (E[] a) {
        qSort3(a, 0, a.length-1);
    }
    /**
     * the method that represents the recursive quick sort algorithm
     *
     * @param  the array to be sorted 
     * @param the iterator from the left
     * @param the iterator from the right
     */
    public void qSort3 (E[] a, int fst, int lst) {
        if (fst < lst) {
            int pivIndex = partition3(a, fst, lst);
            qSort3(a, fst, pivIndex-1);
            qSort3(a, pivIndex+1, lst);
        }
    }
    /**
     * the method that partitions a part of the array using the median of the first element,
     * the middle, and the last as a pivot
     *
     * @param  the array to be sorted 
     * @param the iterator from the left
     * @param the iterator from the right
     */
    public int partition3 (E[] a, int fst, int lst) {
        E pivot; int m=(fst+lst)/2;int p;
        if (((a[fst].compareTo(a[m]))*(a[m].compareTo(a[lst])))>=0){
            p=m;
        }else if(((a[m].compareTo(a[fst]))*(a[fst].compareTo(a[lst])))>=0){
            p=fst;
        }else {
            p=lst;
        }
        E tmp1 = a[fst];
        a[fst] = a[p];
        a[p] = tmp1;
        pivot=a[fst];
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
