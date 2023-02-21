package Hashing;
import java.util.*;


public class LargestSubArraySum0 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        HashMap<Integer, Integer> hm = new HashMap<>();
        //Find the largest sub-array sum with sum = 0;
        //Approach
        //Sum(j) = Sum (i)
        //If sumj = sum i then a subarray exists with wum 0 as sum j -sumi = 0 them sumj = sumi
        //Use a hashmap to store the keys as sum and values as index
        //Maintain a sum and length variable update the length as required by finding the max

        //First use a for loop to put the keys and values
        int sum = 0;
        int length = 0;
        for(int j =0; j<hm.size();j++){
            sum+= arr[j];
            //Check if key(sum) exists int the hashmap
            if (hm.containsKey(sum)){
                length = Math.max(length, j- hm.get(sum));

            }
            else{
                hm.put(sum,j);
            }
            System.out.println("Largest subarray sum length = "+length);
        }


    }
}
