package Sorting;

import java.util.List;

public class SortingUtil {

    public  static <T extends Comparable<T>> void insertionSort(List<T> arraylist){
        for (int j = 1; j < arraylist.size(); j++) {
            T cur = arraylist.get(j);
            int i = j-1;
            while ((i > -1) && (arraylist.get(i).compareTo(cur)>0)) {
               arraylist.set(i+1,arraylist.get(i));
                i--;
            }
            arraylist.set(i+1,cur);
        }
    }

    public  static <T extends Comparable<T>> void quickSort(List<T> array,int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(array,begin, end);
            quickSort(array,begin, partitionIndex-1);
            quickSort(array,partitionIndex+1, end);
        }
    }


    private  static <T extends Comparable<T>> int partition(List<T> array,int begin, int end) {
        T pivot = array.get(end);
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (array.get(j).compareTo(pivot)<=0) {
                i++;
                swap(array,i,j);
            }
        }
        swap(array,i+1,end);


        return i+1;
    }
    public static <T extends Comparable<T>> void swap(List<T> array,int i,int j){
        T swapTemp = array.get(i);
        array.set(i,array.get(j));
        array.set(j,swapTemp);
    }
}
