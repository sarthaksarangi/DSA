package Backtracking;

public class PrintSubsets {
    public static void main(String[] args) {
        printSubsets("abc",0,"");
    }
    public static void printSubsets(String str, int i, String ans){
        //Base case
        if (i==str.length()){
            System.out.println(ans);
            return;
        }
        //choice is yes
        printSubsets(str,i+1,ans+str.charAt(i));
        //choice is no
        printSubsets(str,i+1,ans);
    }
}
