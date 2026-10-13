package Arrays.LogicBuilding;

import java.util.Arrays;

public class MoveAllZeroestoEnd {
    static void main() {
        int[] arr = {1,0,2,3,2,0,0,0,4,5,6};
        optimalSolution(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void optimalSolution(int[] arr){
        int j=-1;

        if(arr.length==1) return;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j<0) return;
        int i=j+1;
        while (i<arr.length){
            if(arr[i]!=0){
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;
            }else{
                i++;
            }
        }


    }
}
