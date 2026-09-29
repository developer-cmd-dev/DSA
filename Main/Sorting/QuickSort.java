package Sorting;

import java.util.Arrays;

public class QuickSort {
    static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    static void quickSort(int[] arr,int low,int high){

        if(low<high){
            int partitionIndex = placePivotCorrectOrder(arr,low,high);
            quickSort(arr,low, partitionIndex -1);
            quickSort(arr, partitionIndex +1,high);
        }



    }

    static int placePivotCorrectOrder(int[] arr,int low,int high){
        int pivot = arr[low];
        int i=low,j=high;
        while (i<j){
            while (arr[i]<=pivot && i<=high-1)i++;
            while (arr[j]>pivot && j>=low+1)j--;
            if (i<j ) {
               swap(arr,i,j);
            }
        }

        swap(arr,low,j);

        return j;
    }

    static void swap (int[] arr,int left,int right){
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
