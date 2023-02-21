package Recursion;

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(tiling(4));

    }
    //Problem: Find the no. of ways to place the tiles on a floor of 2xn size where the length of each tile is 2x1
    public static int tiling(int n){ //The length of the floor is 2xn
        //First calculate the no. of ways to place the tiles vertically
        //Length of the tile is 2x1

        //Base case
        //If at any point the np. of n will be 0 or 1 there will be only one way to place the tiles
        //For n = 0 no tiles can be placed and the floor will be represented as a single 2 dimensional line
        //For n = 1 only one tiles can be placed vertically
        if(n==0|| n ==1){
            return 1;
        }
        //Vertical Way
        int vertical = tiling(n-1);
        //Horizontal
        int horizpntal = tiling(n-2);

        int totalWays = vertical+horizpntal;
        return totalWays;

    }
}
