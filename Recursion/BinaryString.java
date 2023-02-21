package Recursion;

public class BinaryString {
    public static void main(String[] args) {
        binaryString("",0,3);

    }
    public static void binaryString(String str, int lastPlace,int n ){
        //Problem Statement
        //There can not be any consecutive ones in any string of length n
        //n = length of the binary string
        //Base Case

        if (n==0){
            System.out.println(str);
            return;
        }
//kaam
        //we have to place zero always in the last place so first lets finish placing all zeros
            binaryString(str+"0",0,n-1);
        //after the recursion will print all zeros then we can add 1 to it only if there is a zero in the last place
            if (lastPlace==0) {
                binaryString(str + "1", 1, n - 1);
            }






    }
}
