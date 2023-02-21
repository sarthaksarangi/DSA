package Greedy;
import java.util.*;
public class FractionalKnapsack {
    public static void main(String [] args){
        int value[] = {60,100,120};
        int weight [] = {10,20,30};
        int max = 50;
        int maxValue=0;
        //2 columns first will store the index and second will store the ratio of value/weight
        double ratio[][] = new double[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));


        for (int i = ratio.length-1; i >=0 ; i--) {
            int idx = (int)ratio[i][0];
            if (max>=weight[idx]){
                maxValue = maxValue+value[idx];
                max = max -weight[idx];
            }
            else{
                maxValue = maxValue + ((int)ratio[i][1]* max);
                max = 0;
                break;
            }

        }
        System.out.println(maxValue);

    }
}
