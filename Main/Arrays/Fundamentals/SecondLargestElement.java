package Arrays.Fundamentals;

public class SecondLargestElement {
    static void main() {
        int[] arr = {1,3,5,2,8,7};
        secondLargestBetter(arr);
        secondLargestOptimal(arr);

    }

    static void secondLargestBetter(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }

    static void secondLargestOptimal(int[] arr) {
        int largest = arr[0];
        int secondlargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest=largest;

                largest = arr[i];

            }else if(arr[i]< largest && arr[i] > secondlargest){
                secondlargest=arr[i];
            }
        }

        System.out.println(secondlargest);
    }

}
