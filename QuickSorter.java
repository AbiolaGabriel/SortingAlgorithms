
/**
 * QuickSorter interface is an interface for the quick sorting algorithms
 *
 * @author Omar Drira & Abiola Olofin
 * @version 03/12/20
 */
public abstract class QuickSorter<E extends Comparable<E>>
{
    /**
     * the method that quicksorts the array
     *
     * @param  the array to be sorted
     */
    abstract void qSort(E[] a);
}
