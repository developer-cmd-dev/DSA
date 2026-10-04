package Arrays.Fundamentals;

public class MaximumConsecutiveOnes {
    static void main() {
        int[] arr = {1,1,0,1,1,1,0,1,1};
        System.out.println(maximumConsecutiveOnes(arr));
    }

    static int maximumConsecutiveOnes(int[] arr){
        int max=Integer.MIN_VALUE;
        int count=0;
        for (int j : arr) {
            if (j == 1) {
                count++;
                if (max < count) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }
}
