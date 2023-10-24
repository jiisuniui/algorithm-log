import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        int s = score.length - m;
        while(s>=0){
            answer += score[s] * m;
            s-=m;
        }
        
        return answer;
    }
}