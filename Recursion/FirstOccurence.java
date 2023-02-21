package Recursion;

public class FirstOccurence {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,4,7,8,3,4};
        System.out.println(firstOccurence(arr,0,4));

    }
    public static int firstOccurence(int [] arr, int i,int key){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return firstOccurence(arr,i+1,key);
    }
}
