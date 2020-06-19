
/**

 * SelectionSort is a class for the selection sort algorithm
 *
 * @author Omar Drira & Abiola Olofin
 * @version 03/12/20
 */
public class SelectionSort<E extends Comparable<E>> implements Sorter<E>
{
    // instance variables - replace the example below with your own
     E[]a;

    /**
     * Constructor for objects of class SelectionSort
     */
    public SelectionSort(E[] a)
    {
        // initialise instance variables
        this.a=a;
    }

    /**
     * the method that sorts the array using the selection sort algorithm
     *
     * @param  the array to be sorted
     */
    public void sort (E[] a) {
        int n = a.length;
        for (int fill = 0; fill < n-1; fill++) {
            int posMin = fill;
            for (int nxt = fill+1; nxt < n; nxt++)
            if (a[nxt].compareTo(a[posMin])<0)
            posMin = nxt;
            E tmp = a[fill];
            a[fill] = a[posMin];
            a[posMin] = tmp;
        }
    }
}
