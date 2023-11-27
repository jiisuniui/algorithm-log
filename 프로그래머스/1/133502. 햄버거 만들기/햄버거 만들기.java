import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] food = new int[ingredient.length];
        
        int idx=0;
        for(int i:ingredient){
            food[idx] = i;
            idx++;
            
            if(idx>=4){
                if(food[idx-1]==1 && food[idx-2]==3 && food[idx-3]==2 && food[idx-4]==1){
                    answer++;
                    idx-=4;
                }
            }
        }
        
        return answer;
    }
}