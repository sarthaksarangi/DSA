package Recursion;

public class FriendsPairing {
    public static void main (String [] args){
        System.out.println(friendPairing(3));

    }
    public static int friendPairing(int n ){
        //Problem Statement : You have been given n no. of friends AND YOU HAVE TO EITHER MAKE A PAIR WITH THEM OR THEY CAN remain single

        //no. of ways in which 2 friends can be paired will be friendPairing(n-2)*n-1
        //Base case
        //When there is only one person he can be paired only in one way when there are two people they can be paired once or remain single
        //so the no. of ways will be equal to one and two respectively
        if(n==1||n==2){
            return n;
        }

        return friendPairing(n-1)+(n-1)*friendPairing(n-2);

    }
}
