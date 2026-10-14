package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementI {
    static void main() {
        int[] arr = {2,2,3,3,1,2,2};
        System.out.println(betterSolution(arr));

    }

    static int betterSolution(int[] arr){
        HashMap<Integer,Integer> track = new HashMap<>();
        for (int num : arr) {
            track.put(num, track.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : track.entrySet()) {
            if (entry.getValue() > (arr.length / 2)) {
                return entry.getKey(); // This successfully exits the entire method
            }
        }

        return -1;

    }
}
