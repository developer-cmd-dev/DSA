package Arrays.LogicBuilding;

public class FindMissingNumbers {
    static void main() {
        int[] arr={3,0,1};
        System.out.println(findMissingNumberUsingSum(arr,3));

        System.out.println( findMissingNumberUsingXOR(arr,3));
    }

    static int findMissingNumberUsingSum(int[] arr,int k){

        int sum = k*(k+1)/2;
        int sum2=0;
        for (int i = 0; i <arr.length ; i++) {
            sum2+=arr[i];
        }

        return (sum-sum2);
    }

    static int findMissingNumberUsingXOR(int[] arr,int k){
        int xor1=0;
        int xor2=0;
        for (int i = 0; i < arr.length ; i++) {
            xor2 = xor2^arr[i];
            xor1=xor1^i+1;
        }

        return xor1 ^ xor2;
    }
}
