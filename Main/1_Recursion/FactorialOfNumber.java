void main() {
    System.out.println(FactorialNumber(5));
}


int FactorialNumber(int n){
    if(n==1){
        return 1;
    }

    return  n* FactorialNumber(n-1);
}