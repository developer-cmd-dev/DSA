void main() {
    System.out.println();


//printNumber(1,10);

    sumOfFirstNnumber(10,0);
    System.out.println(sumOfNNumber(10));


}




void printNumber (int i,int n){
if(i>10){
    return;
}

    System.out.println(i);
    printNumber(i+1,n);
}


// Using parametrized.
void sumOfFirstNnumber(int i,int sum){
    if(i < 1){
        System.out.println(sum);
        return;
    }

    sumOfFirstNnumber(i-1,sum+i);

}


// using function return.
int sumOfNNumber(int n){
    if(n==0){
        return  0;
    }
    return  n + sumOfNNumber(n-1);
}