package Stack;
import java.util.*;
public class NextGreater {
    public static void main(String[] args) {
        int arr[]= {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<Integer>();

        //for
        for (int i = arr.length-1;i>=0;i--){

            //while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //if-else
            if (s.isEmpty()){
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i] = arr[s.peek()];
            }
            //push element into the stack
            s.push(i);
        }

        for (int i = 0; i<arr.length;i++){
            System.out.print(nextGreater[i]+" ");
        }



    }
}
