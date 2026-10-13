package Arrays.Fundamentals;

import java.util.Arrays;

public class LeftRotateArrayByKPlace {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7};
        leftRotate(arr,3);
        System.out.println(Arrays.toString(arr));

    }

    static void leftRotate(int[] arr,int k){
        int n=arr.length;
        reverseArrUsingRecursion(n, k,arr);
        reverseArrUsingRecursion(k +1, arr.length-1,arr);
        reverseArrUsingRecursion(n,arr.length-1,arr);
    }


   static void reverseArrUsingRecursion(int i,int n,int[] arr){
        if(i>=n/2){
            return;
        }
        int swap = arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=swap;
        reverseArrUsingRecursion(i+1,n,arr);
    }
}
