package Arrays.LogicBuilding;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArray {
    static void main() {

        int[] arr1 = {1,2,2,3,3,4,5,6};
        int[] arr2 = {2,3,3,5,6,6,7};
        System.out.println(solvingUseOfOptimalSolution(arr1,arr2));

    }

    static List<Integer> solvingUseOfOptimalSolution(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        int n=arr1.length,n2=arr2.length;
        List<Integer> result = new ArrayList<>();
        while (i<n && j<n2){
            if(arr1[i]==arr2[j]){
                result.add(arr1[i]);
                i++;
                j++;
            }else{
                i++;
            }
        }

        return result;
    }
}
