package Recursion;

public class CalculateSum {
    public static void main(String[] args) {
        System.out.println(sum(6));
    }
    public static int sum(int n ){
        if(n==1){
            return 1;
        }
        int nm1 = sum(n-1);
        int res = n+nm1;
        return res;
    }
}
