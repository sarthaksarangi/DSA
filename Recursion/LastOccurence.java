package Recursion;

public class LastOccurence {
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,6,3,4};
        System.out.println(lastOccurence(arr,0,3));

    }
    public static int lastOccurence(int [] arr, int i, int key){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr,i+1,key);
        if (isFound==-1&& arr[i] ==key){
            return i;
        }
        return isFound;
    }
}
