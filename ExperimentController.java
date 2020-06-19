import java.util.*;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * ExperimentController estimates the run times
 *
 * @author Omar Drira & Abiola Olofin
 * @version 03/12/20
 */
public class ExperimentController{
    public ExperimentController(){
    }
    /**
     * main method
     */
    public static void main(String [] args){
        //Test 1 - Input sizes for each sorting method
        //Selection sort
        ExperimentController a = new ExperimentController();
        int avgSelection = 0;
        int avgBubble = 0;
        int avgInsertion = 0;
        int avgMerge = 0;
        int avgQ1 = 0;
        int avgQ2 = 0;
        int avgQ3 = 0;
        int seed = 23;
        // try{
        // //PrintWriter results = new PrintWriter("Sorting2000.csv");
        // //PrintWriter results = new PrintWriter("Sorting4000.csv");
        // //PrintWriter results = new PrintWriter("Sorting6000.csv");
        // //PrintWriter results = new PrintWriter("Sorting8000.csv");
        // //PrintWriter results = new PrintWriter("Sorting10000.csv");
        // PrintWriter results = new PrintWriter("Sorting20000.csv");
        // //PrintWriter results = new PrintWriter("Sorting100000.csv");
        // //Selection Sort
        // for(int i = 0; i<10; i++){
        // avgSelection += a.testSelection(20000,10);
        // }
        // avgSelection = avgSelection/10;
        // results.println(avgSelection);
        // //avgSelection = 0;

        // //Bubble Sort
        // for(int i = 0; i<10; i++){
        // avgBubble += a.testBubble(20000,10);
        // }
        // avgBubble = avgBubble/10;
        // results.println(avgBubble);
        // //avgBubble = 0;

        // //InsertionSort
        // for(int i = 0; i<10; i++){
        // avgInsertion += a.testInsertion(20000,10);
        // }
        // avgInsertion = avgInsertion/10;
        // results.println(avgInsertion);
        // //avgInsertion = 0;

        // //MergeSort
        // for(int i = 0; i<10; i++){
        // avgMerge += a.testMerge(20000,10);
        // }
        // avgMerge = avgMerge/10;
        // results.println(avgMerge);
        // //avgMerge = 0;

        // //QuickSort1
        // for(int i = 0; i<10; i++){
        // avgQ1 += a.testQuick1(20000,10);
        // }
        // avgQ1 = avgQ1/10;
        // results.println(avgQ1);
        // //avgQ1 = 0;

        // //QuickSort2
        // for(int i = 0; i<10; i++){
        // avgQ2 += a.testQuick2(20000,10);
        // }
        // avgQ2 = avgQ2/10;
        // results.println(avgQ2);
        // //avgQ2 = 0;

        // //QuickSort3
        // for(int i = 0; i<10; i++){
        // avgQ3 += a.testQuick3(20000,10);
        // }
        // avgQ3 = avgQ3/10;
        // results.println(avgQ3);
        // //avgQ3 = 0;

        // results.close();
        // }

        // catch(Exception e){
        // System.err.println(e);
        // }

        //Test 2 - Quicksort Comparison
        // avgQ1 = 0;
        // avgQ2 = 0;
        // avgQ3 = 0;
        // try{
        // PrintWriter results = new PrintWriter("QuickSort10000.csv");
        // //QuickSort1
        // for(int i = 0; i<10; i++){
        // avgQ1 += a.testQuick1(10000,10);
        // }
        // avgQ1 = avgQ1/10;
        // results.println(avgQ1);

        // //QuickSort2
        // for(int i = 0; i<10; i++){
        // avgQ2 += a.testQuick2(10000,10);
        // }
        // avgQ2 = avgQ2/10;
        // results.println(avgQ2);

        // //QuickSort3
        // for(int i = 0; i<10; i++){
        // avgQ3 += a.testQuick3(10000,10);
        // }
        // avgQ3 = avgQ3/10;
        // results.println(avgQ3);

        // results.close();
        // }

        // catch(Exception e){
        // System.err.println(e);
        // }

        // //Test 3 - Input array already sorted*
        int size = 10000;
        Random r = new Random(seed);
        // Integer [] arr = new Integer [size];
        // Integer [] arr2 = new Integer [size];
        // Integer [] arr3 = new Integer [size];
        // int z = 0;
        // int c = arr2.length-1;
        // avgSelection = 0;
        // avgBubble = 0;
        // avgInsertion = 0;
        // avgMerge = 0;
        // avgQ1 = 0;
        // avgQ2 = 0;
        // avgQ3 = 0;
        // Integer rand2 = null;
        // while(z<arr.length){
        // Integer rand = r.nextInt();
        // arr[z] = rand;
        // arr2[c] = rand;
        // if(z%2 == 0){
        // arr3[z] = rand;
        // rand2 = rand;
        // }
        // else{
        // arr3[z] = rand2;
        // }
        // z++;
        // c--;
        // }
        // Arrays.sort(arr);
        // Arrays.sort(arr2);
        // Arrays.sort(arr2, Collections.reverseOrder());
        //System.out.println(Arrays.toString(arr3));
        // try {
        // PrintWriter results = new PrintWriter("Sorted5000.csv");
        // //Selection Sort
        // for(int i = 0; i<10; i++){
        // avgSelection += a.testSelection(arr);
        // }
        // avgSelection = avgSelection/10;
        // results.println(avgSelection);
        // //avgSelection = 0;

        // //Bubble Sort
        // for(int i = 0; i<10; i++){
        // avgBubble += a.testBubble(arr);
        // }
        // avgBubble = avgBubble/10;
        // results.println(avgBubble);
        // //avgBubble = 0;

        // //InsertionSort
        // for(int i = 0; i<10; i++){
        // avgInsertion += a.testInsertion(arr);
        // }
        // avgInsertion = avgInsertion/10;
        // results.println(avgInsertion);
        // //avgInsertion = 0;

        // //MergeSort
        // for(int i = 0; i<10; i++){
        // avgMerge += a.testMerge(arr);
        // }
        // avgMerge = avgMerge/10;
        // results.println(avgMerge);
        // //avgMerge = 0;

        // //QuickSort1
        // for(int i = 0; i<10; i++){
        // avgQ1 += a.testQuick1(arr);
        // }
        // avgQ1 = avgQ1/10;
        // results.println(avgQ1);
        // //avgQ1 = 0;

        // //QuickSort2
        // for(int i = 0; i<10; i++){
        // avgQ2 += a.testQuick2(arr);
        // }
        // avgQ2 = avgQ2/10;
        // results.println(avgQ2);
        // //avgQ2 = 0;

        // //QuickSort3
        // for(int i = 0; i<10; i++){
        // avgQ3 += a.testQuick3(arr);
        // }
        // avgQ3 = avgQ3/10;
        // results.println(avgQ3);

        // results.close();
        // }
        // catch(Exception e){
        // System.err.println(e);
        // }

        // avgSelection = 0;
        // avgBubble = 0;
        // avgInsertion = 0;
        // avgMerge = 0;
        // avgQ1 = 0;
        // avgQ2 = 0;
        // avgQ3 = 0;
        // //Test 4 - Input array sorted in reversing order*
        // try {
        // PrintWriter results = new PrintWriter("Reversed10000.csv");
        // //Selection Sort
        // for(int i = 0; i<10; i++){
        // avgSelection += a.testSelection(arr2);
        // }
        // avgSelection = avgSelection/10;
        // results.println(avgSelection);
        // //avgSelection = 0;

        // //Bubble Sort
        // for(int i = 0; i<10; i++){
        // avgBubble += a.testBubble(arr2);
        // }
        // avgBubble = avgBubble/10;
        // results.println(avgBubble);
        // //avgBubble = 0;

        // //InsertionSort
        // for(int i = 0; i<10; i++){
        // avgInsertion += a.testInsertion(arr2);
        // }
        // avgInsertion = avgInsertion/10;
        // results.println(avgInsertion);
        // //avgInsertion = 0;

        // //MergeSort
        // for(int i = 0; i<10; i++){
        // avgMerge += a.testMerge(arr2);
        // }
        // avgMerge = avgMerge/10;
        // results.println(avgMerge);
        // //avgMerge = 0;

        // //QuickSort1
        // for(int i = 0; i<10; i++){
        // avgQ1 += a.testQuick1(arr2);
        // }
        // avgQ1 = avgQ1/10;
        // results.println(avgQ1);
        // //avgQ1 = 0;

        // //QuickSort2
        // for(int i = 0; i<10; i++){
        // avgQ2 += a.testQuick2(arr2);
        // }
        // avgQ2 = avgQ2/10;
        // results.println(avgQ2);
        // //avgQ2 = 0;

        // //QuickSort3
        // for(int i = 0; i<10; i++){
        // avgQ3 += a.testQuick3(arr2);
        // }
        // avgQ3 = avgQ3/10;
        // results.println(avgQ3);

        // results.close();
        // }
        // catch(Exception e){
        // System.err.println(e);
        // }

        // // //Test 5 - Repeated element in input array *
        // avgSelection = 0;
        // avgBubble = 0;
        // avgInsertion = 0;
        // avgMerge = 0;
        // avgQ1 = 0;
        // avgQ2 = 0;
        // avgQ3 = 0;
        // try {
        // PrintWriter results = new PrintWriter("Repeat10000.csv");
        // //Selection Sort
        // for(int i = 0; i<10; i++){
        // avgSelection += a.testSelection(arr3);
        // }
        // avgSelection = avgSelection/10;
        // results.println(avgSelection);
        // //avgSelection = 0;

        // //Bubble Sort
        // for(int i = 0; i<10; i++){
        // avgBubble += a.testBubble(arr3);
        // }
        // avgBubble = avgBubble/10;
        // results.println(avgBubble);
        // //avgBubble = 0;

        // //InsertionSort
        // for(int i = 0; i<10; i++){
        // avgInsertion += a.testInsertion(arr3);
        // }
        // avgInsertion = avgInsertion/10;
        // results.println(avgInsertion);
        // //avgInsertion = 0;

        // //MergeSort
        // for(int i = 0; i<10; i++){
        // avgMerge += a.testMerge(arr3);
        // }
        // avgMerge = avgMerge/10;
        // results.println(avgMerge);
        // //avgMerge = 0;

        // //QuickSort1
        // for(int i = 0; i<10; i++){
        // avgQ1 += a.testQuick1(arr3);
        // }
        // avgQ1 = avgQ1/10;
        // results.println(avgQ1);
        // //avgQ1 = 0;

        // //QuickSort2
        // for(int i = 0; i<10; i++){
        // avgQ2 += a.testQuick2(arr3);
        // }
        // avgQ2 = avgQ2/10;
        // results.println(avgQ2);
        // //avgQ2 = 0;

        // //QuickSort3
        // for(int i = 0; i<10; i++){
        // avgQ3 += a.testQuick3(arr3);
        // }
        // avgQ3 = avgQ3/10;
        // results.println(avgQ3);

        // results.close();
        // }
        // catch(Exception e){
        // System.err.println(e);
        // }

        //Test 5 - My implementation vs Java
        avgQ3 = 0;
        int avgJavaQ = 0;
        avgMerge = 0;
        int avgJavaM = 0;

        try{
            PrintWriter results = new PrintWriter("MergeandQuick.csv");
            //MergeSort
            for(int i = 0; i<10; i++){
                avgMerge += a.testMerge(size, 10);
            }
            avgMerge = avgMerge/10;
            results.println(avgMerge);
            //JavaMerge
            for(int i = 0; i<10; i++){
                avgJavaM += a.javaMerge(size, 10);
            }
            avgJavaM = avgJavaM/10;
            results.println(avgJavaM);
            //QuickSort3
            for(int i = 0; i<10; i++){
                avgQ3 += a.testQuick3(size, 10);
            }
            avgQ3 = avgQ3/10;
            results.println(avgQ3);
            //JavaQuick
            for(int i = 0; i<10; i++){
                avgJavaQ += a.javaQuick(size, 10);
            }
            avgJavaQ = avgJavaQ/10;
            results.println(avgJavaQ);

            results.close();
        }
        catch(Exception e){
            System.err.println(e);
        }
        //Test 6 - Percentage non-sorted vs sorted runtime
        avgSelection = 0;
        avgBubble = 0;
        avgInsertion = 0;
        avgMerge = 0;
        avgQ1 = 0;
        avgQ2 = 0;
        avgQ3 = 0;
        try{
            PrintWriter results = new PrintWriter("Percentage25.csv");
            float percent = 0.25f;
            for(int i = 0; i<10; i++){
                avgSelection += a.testSelectionPercentageSorted(10000, 10, percent);
            }

            for(int i = 0; i<10; i++){
                avgBubble += a.testBubblePercentageSorted(10000, 10, percent);
            }

            for(int i = 0; i<10; i++){
                avgInsertion += a.testInsertionPercentageSorted(10000, 10, percent);
            }

            for(int i = 0; i<10; i++){
                avgMerge += a.testMergePercentageSorted(10000, 10, percent);
            }

            for(int i = 0; i<10; i++){
                avgQ1 += a.testQuick1PercentageSorted(10000, 10, percent);
            }

            for(int i = 0; i<10; i++){
                avgQ2 += a.testQuick2PercentageSorted(10000, 10, percent);
            }

            for(int i = 0; i<10; i++){
                avgQ3 += a.testQuick3PercentageSorted(10000, 10, percent);
            }
        }
        catch(Exception e){
            System.err.println(e);
        }

    }

    public long testSelection(int size, int seed){
        Integer [] x = new Integer [size];
        Random r = new Random(seed);
        for(int i = 0; i<x.length; i++){
            x[i] = r.nextInt();
        }
        SelectionSort<Integer> a = new SelectionSort<Integer>(x);
        long startTime = System.currentTimeMillis();
        a.sort(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testBubble(int size, int seed){
        //long startTime = System.currentTimeMillis();
        Integer [] x = new Integer [size];
        Random r = new Random(seed);
        for(int i = 0; i<x.length; i++){
            x[i] = r.nextInt();
        }
        BubbleSort<Integer> a = new BubbleSort<Integer>(x);
        long startTime = System.currentTimeMillis();
        a.sort(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testInsertion(int size, int seed){
        //long startTime = System.currentTimeMillis();
        Integer [] x = new Integer [size];
        Random r = new Random(seed);
        for(int i = 0; i<x.length; i++){
            x[i] = r.nextInt();
        }
        InsertionSort<Integer> a = new InsertionSort<Integer>(x);
        long startTime = System.currentTimeMillis();
        a.sort(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testMerge(int size, int seed){
        //long startTime = System.currentTimeMillis();
        Integer [] x = new Integer [size];
        Random r = new Random(seed);
        for(int i = 0; i<x.length; i++){
            x[i] = r.nextInt();
        }
        MergeSort<Integer> a = new MergeSort<Integer>(x);
        long startTime = System.currentTimeMillis();
        a.sort(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testQuick1(int size, int seed){
        //long startTime = System.currentTimeMillis();
        Integer [] x = new Integer [size];
        Random r = new Random(seed);
        for(int i = 0; i<x.length; i++){
            x[i] = r.nextInt();
        }
        QuickSort1<Integer> a = new QuickSort1<Integer>(x);
        long startTime = System.currentTimeMillis();
        a.qSort(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testQuick2(int size, int seed){
        //long startTime = System.currentTimeMillis();
        Integer [] x = new Integer [size];
        Random r = new Random(seed);
        for(int i = 0; i<x.length; i++){
            x[i] = r.nextInt();
        }
        QuickSort2<Integer> a = new QuickSort2<Integer>(x);
        long startTime = System.currentTimeMillis();
        a.qSort(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testQuick3(int size, int seed){
        //long startTime = System.currentTimeMillis();
        Integer [] x = new Integer [size];
        Random r = new Random(seed);
        for(int i = 0; i<x.length; i++){
            x[i] = r.nextInt();
        }
        QuickSort3<Integer> a = new QuickSort3<Integer>(x);
        long startTime = System.currentTimeMillis();
        a.qSort(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    //Methods to take in arrays
    public long testSelection(Integer[]arr){
        //long startTime = System.currentTimeMillis();
        SelectionSort<Integer> a = new SelectionSort<Integer>(arr);
        long startTime = System.currentTimeMillis();
        a.sort(arr);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testBubble(Integer[]arr){
        //long startTime = System.currentTimeMillis();
        BubbleSort<Integer> a = new BubbleSort<Integer>(arr);
        long startTime = System.currentTimeMillis();
        a.sort(arr);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testInsertion(Integer[]arr){
        //long startTime = System.currentTimeMillis();
        InsertionSort<Integer> a = new InsertionSort<Integer>(arr);
        long startTime = System.currentTimeMillis();
        a.sort(arr);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testMerge(Integer[]arr){
        //long startTime = System.currentTimeMillis();
        MergeSort<Integer> a = new MergeSort<Integer>(arr);
        long startTime = System.currentTimeMillis();
        a.sort(arr);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testQuick1(Integer[]arr){
        //long startTime = System.currentTimeMillis();
        QuickSort1<Integer> a = new QuickSort1<Integer>(arr);
        long startTime = System.currentTimeMillis();
        a.qSort(arr);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testQuick2(Integer[]arr){
        //long startTime = System.currentTimeMillis();
        QuickSort2<Integer> a = new QuickSort2<Integer>(arr);
        long startTime = System.currentTimeMillis();
        a.qSort(arr);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testQuick3(Integer[]arr){
        QuickSort3<Integer> a = new QuickSort3<Integer>(arr);
        long startTime = System.currentTimeMillis();
        a.qSort(arr);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long javaMerge(int size,int seed){
        Random r = new Random(seed);
        Integer [] newArr = new Integer [size];
        int [] newArr2 = new int [size];
        int j = 0;
        while(j<newArr.length){
            newArr[j] = r.nextInt();;
            j++;
        }
        long startTime = System.currentTimeMillis();
        Arrays.sort(newArr);
        long endTime = System.currentTimeMillis();
        return(endTime - startTime);
    }

    public long javaQuick(int size, int seed){
        Random r = new Random(seed);
        int [] newArr2 = new int [size];
        int j = 0;
        while(j<newArr2.length){
            newArr2[j] = r.nextInt();;
            j++;
        }
        long startTime = System.currentTimeMillis();
        Arrays.sort(newArr2);
        long endTime = System.currentTimeMillis();
        return(endTime - startTime);
    }

    public long testSelectionPercentageSorted(int size, int seed,float percentage){
        Integer [] x = new Integer [size];
        int stop=(int)((x.length)*percentage);
        for(int i=0;i<stop;i++){
            x[i]=i;
        }
        Random r = new Random(seed);
        for(int i = stop; i<x.length; i++){
            x[i] = stop+ r.nextInt();
        }
        SelectionSort<Integer> a = new SelectionSort<Integer>(x);
        long startTime = System.currentTimeMillis();
        a.sort(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testBubblePercentageSorted(int size, int seed,float percentage){
        //long startTime = System.currentTimeMillis();
        Integer [] x = new Integer [size];
        int stop=(int)((x.length)*percentage);
        for(int i=0;i<stop;i++){
            x[i]=i;
        }
        Random r = new Random(seed);
        for(int i = stop; i<x.length; i++){
            x[i] = stop + r.nextInt();
        }
        BubbleSort<Integer> a = new BubbleSort<Integer>(x);
        long startTime = System.currentTimeMillis();
        a.sort(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testInsertionPercentageSorted(int size, int seed,float percentage){
        //long startTime = System.currentTimeMillis();
        Integer [] x = new Integer [size];
        int stop=(int)((x.length)*percentage);
        for(int i=0;i<stop;i++){
            x[i]=i;
        }
        Random r = new Random(seed);
        for(int i = stop; i<x.length; i++){
            x[i] = stop + r.nextInt();
        }
        InsertionSort<Integer> a = new InsertionSort<Integer>(x);
        long startTime = System.currentTimeMillis();
        a.sort(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testMergePercentageSorted(int size, int seed,float percentage){
        //long startTime = System.currentTimeMillis();
        Integer [] x = new Integer [size];
        int stop=(int)((x.length)*percentage);
        for(int i=0;i<stop;i++){
            x[i]=i;
        }
        Random r = new Random(seed);
        for(int i = stop; i<x.length; i++){
            x[i] = stop + r.nextInt();
        }
        MergeSort<Integer> a = new MergeSort<Integer>(x);
        long startTime = System.currentTimeMillis();
        a.sort(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testQuick1PercentageSorted(int size, int seed,float percentage){
        //long startTime = System.currentTimeMillis();
        Integer [] x = new Integer [size];
        int stop=(int)((x.length)*percentage);
        for(int i=0;i<stop;i++){
            x[i]=i;
        }
        Random r = new Random(seed);
        for(int i = stop; i<x.length; i++){
            x[i] = stop + r.nextInt();
        }
        QuickSort1<Integer> a = new QuickSort1<Integer>(x);
        long startTime = System.currentTimeMillis();
        a.qSort(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testQuick2PercentageSorted(int size, int seed,float percentage){
        //long startTime = System.currentTimeMillis();
        Integer [] x = new Integer [size];
        int stop=(int)((x.length)*percentage);
        for(int i=0;i<stop;i++){
            x[i]=i;
        }
        Random r = new Random(seed);
        for(int i = stop; i<x.length; i++){
            x[i] = stop + r.nextInt();
        }
        QuickSort2<Integer> a = new QuickSort2<Integer>(x);
        long startTime = System.currentTimeMillis();
        a.qSort(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long testQuick3PercentageSorted(int size, int seed,float percentage){
        //long startTime = System.currentTimeMillis();
        Integer [] x = new Integer [size];
        int stop=(int)((x.length)*percentage);
        for(int i=0;i<stop;i++){
            x[i]=i;
        }
        Random r = new Random(seed);
        for(int i = stop; i<x.length; i++){
            x[i] = stop + r.nextInt();
        }
        QuickSort3<Integer> a = new QuickSort3<Integer>(x);
        long startTime = System.currentTimeMillis();
        a.qSort(x);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }
}
