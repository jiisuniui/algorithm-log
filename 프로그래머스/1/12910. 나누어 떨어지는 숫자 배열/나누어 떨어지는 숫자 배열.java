import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int a:arr){
            if(a%divisor == 0){
                list.add(a);
            }
        }
        
        int size = list.size();
        int[] answer;
        if(size==0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[size];
            for(int i=0; i<size; i++){
                answer[i]=list.get(i);
            }
            Arrays.sort(answer);
        }
        
        
        return answer;
    }
}