package Backtracking;

public class GridWays {
    public static void main (String [] args){
        System.out.println(gridWays(0,0,3,3));

    }
    public static int gridWays(int i, int j , int n , int m){
        //Base case
        if (i==n-1 && j==m-1){
            return 1;
        }else if (i==n||j==m){
            return 0;
        }

        //Calculate ways for right step
        int w1= gridWays(i,j+1,n,m);
        //Calculate ways for down step
        int w2= gridWays(i+1,j,n,m);
        return w1+w2;

    }
}
