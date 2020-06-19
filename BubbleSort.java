
/**
 * BubbleSort is a class for the bubble sort algorithm
 *
 * @author Omar Drira & Abiola Olofin
 * @version 03/12/20
 */
public class BubbleSort<E extends Comparable<E>> implements Sorter<E>
{
    // instance variables - replace the example below with your own
    E[]a;

    /**
     * Constructor for objects of class BubbleSort
     */
    public BubbleSort(E[]a)
    {
        // initialise instance variables
        this.a=a;
    }

    /**
     * the method that sorts the array using the bubble sort algorithm
     *
     * @param  the array to be sorted
     */
    public void sort (E[] a) 
    {
        int pass = 1;
        boolean exchanges;
        do {
            exchanges = false;
            for (int i = 0; i < a.length-pass; i++)
            if (a[i].compareTo(a[i+1]) > 0) {
                E tmp = a[i];
                a[i] = a[i+1];
                a[i+1] = tmp;
                exchanges = true;
            }
            pass++;
        } while (exchanges);
    }
}
