package Arrays.Fundamentals;

import java.util.Arrays;

public class RemoveDuplicatesInPlaceFromArray {
    static void main() {
        int[] arr = {1,1,2,3,3,3,3,4,4,5};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));

    }

    static int removeDuplicates(int[] arr){
        int i=0;
        for (int j = 1; j <arr.length ; j++) {
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }

        return i++;
    }
}
