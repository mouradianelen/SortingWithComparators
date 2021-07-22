package Sorting;

import java.util.ArrayList;

import static Sorting.SortingUtil.insertionSort;
import static Sorting.SortingUtil.quickSort;

public class SortingTest {
    public static void main(String[] args) {
        ArrayList<Test> list=new ArrayList<>();
        ArrayList<Test> list1=new ArrayList<>();
        list.add(new Test(4));
        list.add(new Test(122));
        list.add(new Test(2));
        list.add(new Test(5));
        list.add(new Test(67));
        list1.add(new Test(4));
        list1.add(new Test(122));
        list1.add(new Test(2));
        list1.add(new Test(5));
        list1.add(new Test(67));
        quickSort(list,0,4);
        insertionSort(list1);
        System.out.println(list.toString());
        System.out.println(list1.toString());
    }

}
