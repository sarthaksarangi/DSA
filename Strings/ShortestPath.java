package Strings;

public class ShortestPath {
    public static void main(String[] args) {
        String str = "WNEENEENNN";
        System.out.println(getSortestpath(str));
    }
    public static float getSortestpath(String str){
        int x = 0, y = 0;
        for (int i = 0; i < str.length() ; i++) {
            //north
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            } else if (str.charAt(i) == 'E') {
                x++;
            }
            else{
                x--;
            }
           // Calculating the value of MAth.sqrt((x2-x1)^2 + (y2-y1)^2))


        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
}
