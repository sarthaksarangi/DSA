package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(3));

    }
    public static int fibonacci(int n ){
        if(n==0|| n==1){
            return n;
        }
        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        return fibnm1+fibnm2;
    }
}
