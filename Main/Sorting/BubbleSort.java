package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] arr = {13,46,24,52,20,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
    int n = arr.length;

    for (int i=n-1;i>=1;i--){
        int didSwap=0;
        for (int j=0;j<=i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                didSwap=1;
            }
            if(didSwap==0)break;
        }
    }
    }

// Time complexity will be the O(n^2) in worst case scenario and the best case scenario is O(n) to put the checks like didSwap.
}
