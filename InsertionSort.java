
/**
 * InsertionSort is a class for the insertion sort algorithm
 *
 * @author Omar Drira & Abiola Olofin
 * @version 03/12/20
 */
public class InsertionSort<E extends Comparable<E>> implements Sorter<E>
{
    // instance variables - replace the example below with your own
    E[]a;

    /**
     * Constructor for objects of class InsertionSort
     */
    public InsertionSort(E[]a)
    {
        // initialise instance variables
        this.a=a;
    }

    /**
     * the method that sorts the array using the insertion sort algorithm
     *
     * @param  the array to be sorted
     */
    public void sort (E[] a) {
        for (int nextPos = 1;nextPos < a.length;nextPos++) {
            insert(a, nextPos);
        }
    }
    /**
     * the method that inserts the element at the right position in the array
     *
     * @param  the array to be sorted
     * @param the next position
     */
    private static <E extends Comparable<E>> void insert (E[] a, int nextPos) {
        E nextVal = a[nextPos];
        while
        (nextPos > 0 &&
        nextVal.compareTo(a[nextPos-1]) < 0){
            a[nextPos] = a[nextPos-1];
            nextPos--;
        }
        a[nextPos] = nextVal;
    }
}
