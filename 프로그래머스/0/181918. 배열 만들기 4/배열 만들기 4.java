import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk;
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(ans.size()==0){
                ans.add(arr[i]); 
            }else{
                if(ans.get(ans.size()-1)<arr[i]){
                    ans.add(arr[i]);
                }else{
                    ans.remove(ans.size()-1);
                    i--;
                }
            }
        }
        
        stk = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            stk[i] = ans.get(i);
        }
        return stk;
    }
}