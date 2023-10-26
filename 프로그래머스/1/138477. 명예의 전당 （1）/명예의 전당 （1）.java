import java.util.*;

class Solution {

    public int[] solution(int k, int[] score) {
        int[] answer = new int [score.length];
        List<Integer> top = new ArrayList<>();
    
        for(int i=0; i<score.length; i++){
            if(top.size() < k){
                top.add(score[i]);
                Collections.sort(top);
            }
            else if(top.get(0) < score[i]){
                top.remove(0);
                top.add(score[i]);
                Collections.sort(top);
            }
            answer[i] = top.get(0);
        }
        
        
        return answer;
    }
    
}