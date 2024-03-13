class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=1; i<numLog.length; i++){
            int change = numLog[i]-numLog[i-1];
            if(change == 1){
                answer+="w";
            }else if(change == -1){
                answer+="s";
            }else if(change == 10){
                answer+="d";
            }else if(change == -10){
                answer+="a";
            }
        }
        return answer;
    }
}