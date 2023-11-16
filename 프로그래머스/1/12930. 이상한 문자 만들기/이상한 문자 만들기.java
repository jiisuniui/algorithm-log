class Solution {
    public String solution(String s) {
        String answer = "";
        int go = 'A'-'a';
        
        int index=1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                answer+=' ';
                index=1;
                continue;
            }
            
            if(index%2==1){
                if('a'<=s.charAt(i) && s.charAt(i)<='z'){
                    answer+=(char)(s.charAt(i)+go);
                }
                else if('A'<=s.charAt(i) && s.charAt(i)<='Z'){
                    answer+=s.charAt(i);
                }
                index++;
            } else if(index%2==0){
                if('a'<=s.charAt(i) && s.charAt(i)<='z'){
                    answer+=s.charAt(i);
                }
                else if('A'<=s.charAt(i) && s.charAt(i)<='Z'){
                    answer+=(char)(s.charAt(i)-go);
                }
                index++;
            }
        }
        
        return answer;
    }
}