import java.util.*;
import java.io.FileReader;
/**
 * Comparison class gives us two methods that give us an unsorted and a sorted list
 *
 * @author Omar Drira & Abiola Olofin
 * @version 03/12/20
 */
public class Comparison
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class Comparison
     */
    public Comparison()
    {

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
