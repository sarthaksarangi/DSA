package Arrays;
import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr [] [] = new int[3][3];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(largest(arr));
    }

    public static int largest(int [][] arr){
        int max  = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if(arr[i][j]>max)
                    max = arr[i][j];
            }

        }
        return max;
    }
}
