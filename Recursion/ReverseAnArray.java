void main() {
    int[] arr ={1,2,3,4,5,6};

    reverseUsingWhileLoop(arr);
    System.out.println(Arrays.toString(arr));
    reverseArrUsingRecursion(0,arr.length,arr);
    System.out.println(Arrays.toString(arr));

}

 void reverseUsingWhileLoop(int[] arr){
    int i=0,j=arr.length-1;

    while (i<j){
        int swap = arr[i];
        arr[i]=arr[j];
        arr[j]=swap;
        i++;
        j--;
    }


}


void reverseArrUsingRecursion(int i,int n,int[] arr){
    if(i>=n/2){
        return;
    }
    int swap = arr[i];
    arr[i]=arr[n-i-1];
    arr[n-i-1]=swap;
    reverseArrUsingRecursion(i+1,n,arr);
}