import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        List<Integer> ans = new ArrayList<>();
        
        int x=n;
        ans.add(x);
        while(x!=1){
            if(x%2==0){
                x = x/2;
            } else{
                x = x*3+1;
            }
            ans.add(x);
        }
        
        answer = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}