import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        List<Integer> l = new ArrayList<>();
        
        int a=slicer[0];
        int b=slicer[1];
        int c=slicer[2];
        
        if(n==1){
            for(int i=0; i<=b; i++){
                l.add(num_list[i]);
            }
        }else if(n==2){
            for(int i=a; i<num_list.length; i++){
                l.add(num_list[i]);
            }
        }else if(n==3){
            for(int i=a; i<=b; i++){
                l.add(num_list[i]);
            }
        }else if(n==4){
            for(int i=a; i<=b; i=i+c){
                l.add(num_list[i]);
            }
        }
        
        answer = new int[l.size()];
        for(int i=0; i<l.size(); i++){
            answer[i] = l.get(i);
        }
        return answer;
    }
}