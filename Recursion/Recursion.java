void main() {
    System.out.println();


//printNumber(1,10);

    sumOfFirstNnumber(10,0);
    System.out.println(sumOfNNumber(10,0));


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
int sumOfNNumber(int i,int sum){
    if(i<1){
        return  sum+i;
    }
    sum = sumOfNNumber(i-1,sum);
    return  sum+i;
}