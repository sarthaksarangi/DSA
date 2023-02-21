package Hashing;

import java.util.HashMap;
import java.util.Set;

public class MajorityEement {
    public static void main(String[] args){
     int [] arr = {1,3,2,5,1,3,1,5,1};
     majorityElement(arr);

    }
    public static void majorityElement(int[] arr){
        //Given an array of integers you need to find the element that occurs the most amount of times in the array.
        //Take a Hashmap and map the frequency of the elements to its value.
        //For loop for traversing the array and incrementing the occurrence by one each time.

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }

        }
        for (int key: hm.keySet()) {
            if (hm.get(key)>arr.length/3){
                System.out.println(key+":"+hm.get(key)+" ");
            }

        }

    }
}
