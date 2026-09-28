package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
    int[] arr = {13,46,24,52,20,9};
    SelectionSortFunc(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void SelectionSortFunc(int[] arr){
        int n=arr.length;
        for (int i=0;i<=n-2;i++){
                int min = i;
            for (int j =i;j<=n-1;j++) {
                if(arr[j]<arr[min]) min=j;
            }

            int swap = arr[i];
            arr[i]=arr[min];
            arr[min]=swap;
        }


    }


}
