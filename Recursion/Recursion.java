void main() {

printNumber(1,10);



}


void printNumber (int i,int n){
if(i>10){
    return;
}

    System.out.println(i);
    printNumber(i+1,n);
}