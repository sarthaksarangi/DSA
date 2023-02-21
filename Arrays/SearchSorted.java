package Arrays;

public class SearchSorted {
    public static void main(String[] args) {
        int arr [][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        search(arr,150);
    }
    public static boolean search(int arr[][],int key){
        int row = 0;
        int col = arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col] == key ){
                System.out.println("Found at position ("+row+","+col+")");
                return true;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Not Found!");
        return false;
    }

}
