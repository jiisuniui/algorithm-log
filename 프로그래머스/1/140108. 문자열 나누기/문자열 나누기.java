import java.util.*;

class Solution {
    public int solution(String s) {
        List<String> list = new ArrayList<>();
        
        int fnum = 0, onum = 0; 
        int startIdx = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(startIdx)){
                fnum++;
            } else {
                onum++;
            }
            
            if(fnum == onum){
                list.add(s.substring(startIdx, i+1));
                startIdx = i+1;
                fnum = 0;
                onum = 0;
            }
        }

        if(startIdx < s.length()){
            list.add(s.substring(startIdx));
        }
        
        return list.size();
    }
}