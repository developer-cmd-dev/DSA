package Arrays.Fundamentals;

public class CheckArrayIfSorted {
    static void main(String[] args) {
//        int[] arr = {1,3,5,2,8,7};
        int[] arr = {1,2,3,5,7,8};
        System.out.println(checkArraySorted(arr));

    }

    static boolean checkArraySorted(int[] arr){
        boolean sorted = true;

        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }
}
