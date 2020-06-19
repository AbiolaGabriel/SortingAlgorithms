

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * ComparisonTest class tests if the sorting algorithms work successfully on the data set 
 * given by the instructor
 *
 * @author Omar Drira & Abiola Olofin
 * @version 03/12/20
 */
public class ComparisonTest
{
    /**
     * Default constructor for test class ComparisonTest
     */
    public ComparisonTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testSelectionSort(){
        Comparison c=new Comparison();
        Integer[]l=c.unsortedList();
        SelectionSort<Integer> s= new SelectionSort(l);
        s.sort(l);
        assertEquals(c.sortedList(),s.a);
    }
    
    @Test
    public void testBubbleSort(){
        Comparison c=new Comparison();
        Integer[]l=c.unsortedList();
        BubbleSort<Integer> s= new BubbleSort(l);
        s.sort(l);
        assertEquals(c.sortedList(),s.a);
    }
    
    @Test
    public void testInsertionSort(){
        Comparison c=new Comparison();
        Integer[]l=c.unsortedList();
        InsertionSort<Integer> s= new InsertionSort(l);
        s.sort(l);
        assertEquals(c.sortedList(),s.a);
    }
    
    @Test
    public void testMergeSort(){
        Comparison c=new Comparison();
        Integer[]l=c.unsortedList();
        MergeSort<Integer> s= new MergeSort(l);
        s.sort(l);
        assertEquals(c.sortedList(),s.a);
    }
    
    @Test
    public void testQuickSort1(){
        Comparison c=new Comparison();
        Integer[]l=c.unsortedList();
        QuickSort1<Integer> s= new QuickSort1(l);
        s.qSort(l);
        assertEquals(c.sortedList(),s.a);
    }
    
    @Test
    public void testQuickSort2(){
        Comparison c=new Comparison();
        Integer[]l=c.unsortedList();
        QuickSort2<Integer> s= new QuickSort2(l);
        s.qSort(l);
        assertEquals(c.sortedList(),s.a);
    }
    
    @Test
    public void testQuickSort3(){
        Comparison c=new Comparison();
        Integer[]l=c.unsortedList();
        QuickSort3<Integer> s= new QuickSort3(l);
        s.qSort(l);
        assertEquals(c.sortedList(),s.a);
    }
}
