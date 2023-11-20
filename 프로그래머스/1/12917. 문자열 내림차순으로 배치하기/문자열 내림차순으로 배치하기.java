class Solution {
    public String solution(String s) {
        String answer = "";
        int[] small = new int['z'-'a'+1];
        int[] big = new int['Z'-'A'+1];
        
        for(int i=0; i<s.length(); i++){
            if('a'<=s.charAt(i) && s.charAt(i)<='z'){
                small[s.charAt(i)-'a']++;
            }else{
                big[s.charAt(i)-'A']++;
            }
        }
        
        for(int i=small.length-1; i>=0; i--){
            for(int j=0; j<small[i]; j++){
                answer+= (char) (i+'a');
            }
        }
        
        for(int i=big.length-1; i>=0; i--){
            for(int j=0; j<big[i]; j++){
                answer+= (char) (i+'A');
            }
        }
        
        return answer;
    }
}