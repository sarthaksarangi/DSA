package Recursion;

public class OpPrintPow {
    public static void main(String[] args) {
        System.out.println(pow(2,10));

    }
    public static int pow(int x, int n ){
        if (n==0){
            return 1;
        }
        int halfPower = pow(x,n/2);
        //if n is even
        int halfpowerSq = halfPower * halfPower;
        //if n is Odd
        if(n % 2 !=0){
            halfpowerSq = x * halfpowerSq;
        }
        return halfpowerSq;

    }

}
