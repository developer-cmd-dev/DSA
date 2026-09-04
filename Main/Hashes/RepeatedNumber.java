package Hashes;

import java.util.HashMap;

public class RepeatedNumber {
    static void main() {

        int[] arr = {1,2,3,1,4,5,5,6,4,8};
        countReputationUsingHashMap(arr);


    }


    public static void countReputationUsingHashMap(int[] arr){

        HashMap<Integer,Integer> hashMap = new HashMap<>();


        for (int j : arr) {
            if (!hashMap.containsKey(j)) {
                hashMap.put(j, 1);
            } else {
                hashMap.put(j, hashMap.get(j) + 1);
            }
        }

        System.out.println(hashMap);


    }
}
