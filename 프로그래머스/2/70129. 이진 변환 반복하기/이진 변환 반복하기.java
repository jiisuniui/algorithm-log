import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1")){
            int o = s.length();
            s=s.replace("0","");
            int n = s.length();
            answer[1]+=(o-n);
            
            List<Integer> list = new ArrayList<>();
            while(n>0){
                list.add(n%2);
                n/=2;
            }
            
            StringBuilder sb = new StringBuilder();
            for(int i=list.size()-1; i>=0; i--){
                sb.append(list.get(i));
            }
            s=sb.toString();
            answer[0]++;
        }
        return answer;
    }
}