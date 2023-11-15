import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> desc = new ArrayList<>();
        while(n>0){
            desc.add((int)(n%10));
            n = n/10;
        }
        
        int[] answer = new int[desc.size()];
        for(int i=0; i<desc.size(); i++){
            answer[i] = desc.get(i);
        }
        
        return answer;
    }
}