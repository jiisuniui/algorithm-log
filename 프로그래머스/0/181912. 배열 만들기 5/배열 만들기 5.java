import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer;
        List<Integer> arr = new ArrayList<>();
        for(String strs:intStrs){
            String str = strs.substring(s,s+l);
            int a = Integer.parseInt(str);
            if(a>k){
                arr.add(a);
            }
        }
        answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}