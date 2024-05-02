import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        boolean[] nope = new boolean[my_string.length()];
        for(int i:indices){
            nope[i]=true;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            if(!nope[i]){
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}