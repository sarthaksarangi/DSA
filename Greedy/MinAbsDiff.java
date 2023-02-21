package Greedy;
import java.util.Arrays;
public class MinAbsDiff {
    public static void main(String[] args) {
        int [] arr1 = {1,2,8,3};
        int [] arr2 = {7,4,2,1};
        //Sort both the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int minDiff = 0;
        for(int i = 0; i<arr1.length; i++){
            minDiff+= Math.abs(arr1[i]-arr2[i]);
        }
        System.out.println("Minimum absolute difference is: " + minDiff );

    }
}
