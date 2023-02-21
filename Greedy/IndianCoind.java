package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class IndianCoind {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int amt = 590;
        int count =0;

        Arrays.sort(coins,Comparator.reverseOrder());
        ArrayList<Integer> al= new ArrayList<>();
        for (int i = 0; i < coins.length ; i++) {
            if (coins[i]<=amt){
                while(coins[i]<=amt){
                    count++;
                    al.add(coins[i]);
                    amt-= coins[i];
                }
            }
        }
        System.out.println("Count od coins: "+count);
        System.out.println("Coins used are : ");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

    }
}
