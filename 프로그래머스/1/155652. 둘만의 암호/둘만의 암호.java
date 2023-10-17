import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String spell = "abcdefghijklmnopqrstuvwxyz";
        
        for(int i=0; i<skip.length(); i++){
            spell=spell.replace(Character.toString(skip.charAt(i)),"");
        }
        
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            int si = spell.indexOf(c);
            c = spell.charAt((si+index)%spell.length());
            answer+=c;
        }
        
        return answer;
    }
}