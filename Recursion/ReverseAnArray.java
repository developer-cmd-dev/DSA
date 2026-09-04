void main() {
    int[] arr ={1,2,3,4,5,6};

    reverseUsingWhileLoop(arr);
    System.out.println(Arrays.toString(arr));
    reverseArrUsingRecursion(0,arr.length-1,arr);
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


void reverseArrUsingRecursion(int i,int j,int[] arr){

    if(i>=j){
        return;
    }
    int swap = arr[i];
    arr[i]=arr[j];
    arr[j]=swap;

    reverseArrUsingRecursion(i+1,j-1,arr);

}