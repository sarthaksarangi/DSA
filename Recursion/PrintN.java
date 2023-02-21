package Recursion;

public class PrintN {
    public static void main(String[] args) {
       // print(10);
        printDec(10);
    }
    //Print no.s from 1 to n

    public static void print(int n ){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
    public static void printDec(int n ){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);

    }
}
