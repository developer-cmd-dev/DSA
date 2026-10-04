package Arrays.Fundamentals;

public class LargestElement {

    static void main() {

        int[] arr = {1,3,5,2,8,7};
        largestElementOptimal(arr);
    }

    static  void largestElementOptimal(int[] arr){
        int largesst=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>=largesst){
                largesst=arr[i];
            }
        }

        System.out.println(largesst);
    }
}
