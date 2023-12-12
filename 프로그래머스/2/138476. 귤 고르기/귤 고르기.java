import java.util.*;

class Solution {
//     class Tang{
//         int tangerine;
//         int sum;
        
//         public Tang(int tang, int sum){
//             this.tangerine = tang;
//             this.sum = sum;
//         }
//     }
    
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> tangMap = new HashMap<>();
        
        for(int i:tangerine){
            if(tangMap.containsKey(i)){
                tangMap.put(i,(int)tangMap.get(i)+1);
            }else{
                tangMap.put(i,1);
            }
        }
        
        ArrayList<Integer> tangList = new ArrayList<>(tangMap.values());
        Collections.sort(tangList, Collections.reverseOrder());
        
        for(int i:tangList){
            answer++;
            k-=i;
            if(k<1){
                break;
            }
        }
        
        return answer;
    }
}