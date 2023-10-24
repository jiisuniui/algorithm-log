class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        
        for(int i=0; i<code.length(); i++){
            char ch = code.charAt(i);
            if(ch == '1'){
                mode = !mode;
            }else{
                if(mode && i%2==1){   //홀수
                    answer+=ch;
                }else if(!mode && i%2==0){    //짝수
                    answer+=ch;
                }
            }
        }
        
        if(answer.equals("")){
            return "EMPTY";
        }else{
            return answer;
        }
    }
}