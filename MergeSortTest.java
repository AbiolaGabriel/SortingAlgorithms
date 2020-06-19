

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.FileReader;
/**
 * MergeSortTest unit tests the MergeSort class
 *
 * @author Omar Drira & Abiola Olofin
 * @version 03/12/20
 */
public class MergeSortTest
{
    /**
     * Default constructor for test class MergeSortTest
     */
    public MergeSortTest()
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
    public void testMergeSort(){
        Integer[]l=unsortedList();
        MergeSort<Integer> s= new MergeSort(l);
        s.sort(l);
        assertEquals(sortedList(),s.a);
    }
    
    
    /**
     * method that returns an unsorted list
     * @return    unsorted list
     */
    public Integer[] unsortedList()
    {
        Integer[] l=new Integer[1000];
        Scanner sc=null;int i=0;
        try{sc =new Scanner(new FileReader("comparison.txt"));
            while(sc.hasNextLong())
            {int aLong =(int)sc.nextLong();
                l[i]=aLong;
                i++;
            }
        }catch(Exception e)
        {System.out.println(e);
        }
        return l;
    }
    
    /**
     * method that returns a sorted list
     * @return    sorted list
     */
    public Integer[] sortedList()
    {
        Integer[] l=new Integer[1000];
        Scanner sc=null;int i=0;
        try{sc =new Scanner(new FileReader("comparison1.txt"));
            while(sc.hasNextLong())
            {int aLong =(int)sc.nextLong();
                l[i]=aLong;
                i++;
            }
        }catch(Exception e)
        {System.out.println(e);
        }
        return l;
    }
}
