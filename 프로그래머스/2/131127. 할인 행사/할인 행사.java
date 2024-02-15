import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int[] discountNum = new int[number.length];
        
        for(int i=0; i<10; i++){
            for(int j=0; j<want.length; j++){
                if(discount[i].equals(want[j])){
                    discountNum[j]++;
                    break;
                }
            }
        }
        
        if(signup(number,discountNum)){
            answer++;
        }
        
        for(int i=0; i<discount.length-10; i++){
            if(discount[i].equals(discount[i+10])){
                if(signup(number,discountNum)){
                    answer++;
                }
                continue;
            }
            
            int success = 0;
            for(int j=0; j<want.length; j++){
                if(discount[i].equals(want[j])){
                    discountNum[j]--;
                    success++;
                }
                if(discount[i+10].equals(want[j])){
                    discountNum[j]++;
                    success++;
                }
                if(success==2){
                    break;
                }
            }
            if(signup(number,discountNum)){
                answer++;
            }
        }
        
        for(int i=discount.length-10; i<discount.length; i++){
            for(int j=0; j<want.length; j++){
                if(discount[i].equals(want[j])){
                    discountNum[j]--;
                    break;
                }
            }
            if(signup(number,discountNum)){
                answer++;
            }
        }
        return answer;
    }
    
    public boolean signup(int[] number, int[] discountNum){
        for(int i=0; i<number.length; i++){
            if(number[i]>discountNum[i]){
                return false;
            }
        }
        return true;
    }
    
}