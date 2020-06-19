
/**
 * Sorter interface is an interface for the sorting algorithms
 *
 * @author Omar Drira & Abiola Olofin
 * @version 03/12/20
 */
public interface Sorter<E extends Comparable<E>>
{
    /**
     * the method that sorts the array
     *
     * @param  the array to be sorted
     */
    void sort(E[] a);
}
