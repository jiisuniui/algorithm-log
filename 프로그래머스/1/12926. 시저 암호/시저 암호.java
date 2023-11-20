class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if('a'<=c&&c<='z'){
                c+=n;
                if(c>'z'){
                    c-= 'z'-'a'+1;
                }
            }else if('A'<=c&&c<='Z'){
                c+=n;
                if(c>'Z'){
                    c-= 'Z'-'A'+1;
                }
            }
            answer+=c;
        }
        return answer;
    }
}