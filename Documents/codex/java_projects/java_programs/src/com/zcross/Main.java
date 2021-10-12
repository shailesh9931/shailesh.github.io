package com.zcross;
import java.util.Arrays;
import com.zcross.QuickSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 8, 5, 3, 1};
        //int[] arr = {2, 1, 4, 3};
        QuickSort.sort(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }
}



