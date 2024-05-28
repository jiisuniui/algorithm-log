import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer;
        List<Integer> anslist = new ArrayList<>();
        for(int i=0; i<num_list.length; i++){
            if(i%n==0){
                anslist.add(num_list[i]);
            }
        }
        
        answer = new int[anslist.size()];
        for(int i=0; i<anslist.size(); i++){
            answer[i] = anslist.get(i);
        }
        return answer;
    }
}