package Arraylist;
import java.util.*;

public class PairSum2 {
    public static void main (String [] args){

    }
    //Teo pointer approach
    //Rotated sorted arraylist
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int breakingPoint = -1;
        int n = list.size();
        for (int i = 0 ; i<list.size();i++){
            if (list.get(i)<list.get(i+1)){
                breakingPoint = i;
                break;
            }
        }
        int lp = breakingPoint+1;
        int rp = breakingPoint;
        while(lp!= rp){
            //Case 1
            if (list.get(lp) +list.get(rp)== target){
                return true;
            }
            //Case 2
            if (list.get(lp) +list.get(rp)< target){
                lp = (lp+1)%n;
            }
            else
                rp = (n+rp-1)%n;
        }
        return false;


    }
}
