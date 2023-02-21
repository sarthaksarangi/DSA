package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JobSequencing {
    static class Job{
        int profit;
        int deadline;
        int id;// 0(A) 1(B) 2(c)
        Job(int i,int d,int p){
            id = i;
            deadline = d;
            profit = p;
        }

    }
    public static void main(String[] args) {
        int jobsInfo [][] = {{4,20},
                             {1,10},
                             {1,30},
                             {1,40}};
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(jobs, (obj1, obj2)->obj2.profit - obj1.profit); //To sort the profit in decending order
        //a.profit - b.profit to sort the profit in ascending order
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        int profit = 0;
        for(int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline> time){
                seq.add(curr.id);
                profit +=curr.profit;
                time++;
            }
        }
        System.out.println(seq.size());
        System.out.println("profit = "+profit);
        for (int i = 0; i < seq.size(); i++) {
            System.out.println(seq.get(i));
        }
    }
}
