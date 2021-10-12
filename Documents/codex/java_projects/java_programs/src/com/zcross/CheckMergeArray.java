package com.zcross;

public class CheckMergeArray {
    // merge arr1 and arr2 into a new result array
    public static int[] mergeArrays(int[] arr1, int[] arr2)
    {
        int lAr1 = arr1.length;
        int lAr2 = arr2.length;
        // Find the smaller array
        int[] resultAr = new int[lAr1+lAr2];
        int[] smallAr;
        int[] largeAr;
        int index1 = 0; // Keeps track of first array
        int index2 = 0; // Keeps track of second array
        if (lAr1 > lAr2) {
            smallAr = arr2;
            largeAr = arr1;
        } else {
            smallAr = arr1;
            largeAr = arr2;
        }
        for (int i = 0; i < smallAr.length; i++) {
            if(arr1[index1] < arr2[index2]) {
                resultAr[i] = arr1[index1++];
            } else {
                resultAr[i] = arr2[index2++];
            }
        }
        int[] unfinishedAr = index1 > index2 ? arr2 : arr1;
        int smallArLen = smallAr.length;
        for (int i = 0; i < largeAr.length; i++){
            if (i >= smallAr.length) {
                resultAr[i] = unfinishedAr[smallArLen++];
            }
        }
        return resultAr;
    }
}
