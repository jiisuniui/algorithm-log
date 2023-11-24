import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] x = new int[10];
        int[] y = new int[10];
        int[] num = new int[10];
        
        for(int i=0; i<X.length(); i++){
            x[X.charAt(i)-'0']++;
        }
        for(int i=0; i<Y.length(); i++){
            y[Y.charAt(i)-'0']++;
        }
        for(int i=0; i<num.length; i++){
            num[i] = Math.min(x[i],y[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--){
            for(int j=0; j<num[i]; j++){
                sb.append((char)(i+'0'));
            }
        }
        answer=sb.toString();

        if(answer.isEmpty()){
            return "-1";
        }else if(answer.charAt(0)=='0'){
            return "0";
        }   
        return answer;
    }
}