import java.util.*;

class Solution {
    public String solution(String myString) {
        String answer = "";
        int change = 'A'-'a';
        for(int i=0; i<myString.length(); i++){
            if('a'<=myString.charAt(i) && myString.charAt(i)<='z') {
                answer += (char)(myString.charAt(i)+change);
            }else{
                answer += myString.charAt(i);
            }
        }
        return answer;
    }
}