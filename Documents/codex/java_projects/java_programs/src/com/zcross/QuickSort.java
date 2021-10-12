/**
 * ar = {2, 1, 4, 3}
 * ar = {2, 1, 3, 4}
 * ar = {1, 2, 3, 4}
 */

package com.zcross;

public class QuickSort {
    private static void swap(int[] Ar, int pos1, int pos2) {
        if (pos1 != pos2) {
            int temp = Ar[pos1];
            Ar[pos1] = Ar[pos2];
            Ar[pos2] = temp;
        }
    }

    private static int getPartition(int[] Ar, int start, int end) {
        int pivot = Ar[end];
        int pivotIndex = start;
        for (int i = start; i < end; i++) {
            if (Ar[i] < pivot) {
                swap(Ar, i, pivotIndex);
                pivotIndex++;
            }
        }
        swap(Ar, pivotIndex, end);
        return pivotIndex;
    }

    public static void sort(int[] Ar, int start, int end) {
        if (start < end) {
            int partitionKey = getPartition(Ar, start, end);
            sort(Ar, start, partitionKey-1);
            sort(Ar, partitionKey+1, end);
        }
    }

}
