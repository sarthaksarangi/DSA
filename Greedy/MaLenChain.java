package Greedy;
import java.util.Arrays;
import java.util.Comparator;

public class MaLenChain {
    public static void main(String [] args){
        int [] []pairs = {{5,24}, {39,60},{5,28},{27,40},{50,90}};
        //Sort on the basis of the second column
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        //Compare the last elemwnt of the first pair with the first element of the second pair
        int len = 1;
        int pairEnd  = pairs[0][1];// Second element of the first pair
        for(int i = 1; i<pairs.length; i++){
            if (pairs[i][0]> pairEnd){
                len++;
                pairEnd = pairs[i][1];
            }
        }
        System.out.println("Maximum length of chain of pairs is: "+ len);
    }
}
