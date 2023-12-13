import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        if(citations.length==0){
            return citations.length;
        }
        
        for(int i=0; i<=citations.length; i++){
            int num=0;
            for(int j=0; j<citations.length; j++){
                if(citations[j]>=i){
                    num++;
                }
            }
            if(num>=i){
                if(answer<i){
                    answer=i;
                }
            }
        }
        
        return answer;
    }
}