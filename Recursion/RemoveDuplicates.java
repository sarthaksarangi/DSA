package Recursion;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "appnacollege";
        removeDuplicates(str,0,new StringBuilder(),new boolean[26] );

    }
    public static void removeDuplicates(String str, int idx, StringBuilder newString,boolean[] map){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //kaam
        if(map[currChar-'a'] == true){
            //duplicate is present
            //call for the next index
            removeDuplicates(str,idx+1,newString,map);
        }
        else{
            //make the index of the character as true then call for next index
            map[currChar-'a'] = true;
            removeDuplicates(str,idx+1,newString.append(currChar),map);
        }

    }
}
