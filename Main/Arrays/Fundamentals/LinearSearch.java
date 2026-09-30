package Arrays.Fundamentals;

public class LinearSearch {
    static void main() {

        int[] arr = {1,3,4,5,5,6,7};
        System.out.println(linearSearch(arr,4));

    }

    static int linearSearch(int[] arr,int number){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==number) return i;
        }
        return -1;
    }
}
