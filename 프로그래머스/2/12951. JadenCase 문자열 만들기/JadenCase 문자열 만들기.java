class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder st = new StringBuilder();
        int up = 'A'-'a';
        boolean first = true;
 
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c==' '){
                st.append(' ');
                first=true;
                continue;
            }
            if(first){
                if('a'<=c && c<='z'){
                    c=(char)(c+up);
                }
                st.append(c);
                first=false;
            }else{
                if('A'<=c && c<='Z'){
                    c=(char)(c-up);
                }
                st.append(c);
            }
        }
        
        answer = st.toString();
        return answer;
    }
}