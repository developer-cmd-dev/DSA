void main() {

    int number = 16;
    System.out.println(FibonacciNumber(number));
}


int FibonacciNumber(int n){
    if(n<=1){
        return n;
    }

    return FibonacciNumber(n-1)+FibonacciNumber(n-2);
}