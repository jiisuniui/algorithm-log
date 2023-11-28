// ABCDEFGHiJKLMNOPQRSTUVWXYZ
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = new int['Z'];
        
        for(int i=0; i<survey.length; i++){
            if(choices[i]>4){
                score[survey[i].charAt(1)] += (choices[i]-4);
            }else if(choices[i]<4){
                score[survey[i].charAt(0)] += (-choices[i]+4);
            }
        }
        
        if(score['R']<score['T']){
            answer+='T';
        }else{
            answer+='R';
        }
        if(score['C']<score['F']){
            answer+='F';
        }else{
            answer+='C';
        }
        if(score['J']<score['M']){
            answer+='M';
        }else{
            answer+='J';
        }
        if(score['A']<score['N']){
            answer+='N';
        }else{
            answer+='A';
        }
        
        return answer;
    }
}