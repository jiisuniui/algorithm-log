import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Integer> num = new ArrayList<>();
        while(n>0){
            num.add((int)(n%10));
            n/=10;
        }
        
        for(int i=0; i<num.size(); i++){
            for(int j=i+1; j<num.size(); j++){
                if(num.get(i)<num.get(j)){
                    int x=num.get(i);
                    num.set(i,num.get(j));
                    num.set(j,x);
                }
            }
        }
        
        for(int i=0; i<num.size(); i++){
            answer = answer*10 + num.get(i);
        }
        
        return answer;
    }
}