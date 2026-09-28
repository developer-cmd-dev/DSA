package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void main() {
        int[] arr = {13,46,24,52,20,9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSort(int[] arr){
        int n = arr.length;

        for (int i=0;i<=n-1;i++){
            int j=i;
            while (j>0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

    }
}
