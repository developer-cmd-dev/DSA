package Arrays.LogicBuilding;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {
    static void main() {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

        System.out.println(unionOfTwoSortedArrays(arr1,arr2));
    }

    static List<Integer> unionOfTwoSortedArrays(int[] arr1,int[] arr2) {
        int i = 0, j = 0;
        int n = arr1.length, n2 = arr2.length;
        List<Integer> union = new ArrayList<>();
        while (i < n && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (union.isEmpty() || union.getLast() != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (arr2[j] < arr1[i]) {
                    if (union.isEmpty() || union.getLast() != arr2[j]) {
                        union.add(arr2[j]);
                    }
                    j++;
                }
            }
        }

        while (i < n) {
            if (union.isEmpty() || union.getLast() != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < n2) {
            if (union.isEmpty() || union.getLast() != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }
}
