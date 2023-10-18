import java.util.*;

//1   
//10 11
//100 101 110 111
//1000 1001 1010 1011 1100 1101 1110 1111

class Solution {
    public int[] solution(int l, int r) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            boolean isNum =true;
            String str = Integer.toString(i);
            
            for(int j=0; j<str.length(); j++){
                if(Integer.parseInt(str.substring(j,j+1)) % 5 != 0){
                    isNum = false;
                    break;
                }
            }
            
            if(isNum){
                list.add(i);
            }
        }
        
        if(list.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
        } else{
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }   
        }
        
        return answer;
    }
}