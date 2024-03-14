class Solution {
    public String longestPalindrome(String s) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            for(int j=s.length()-1; j>=i; j--){
                if(s.charAt(i)!=s.charAt(j)){
                    continue;
                }
                
                boolean isPalin = true;
                int x=i;
                int y=j;
                while(true){
                    if(s.charAt(x)!=s.charAt(y)){
                        isPalin = false;
                        break;
                    }
                    if(x==y || y-x==1){
                        break;
                    }
                    x++;
                    y--;
                }
                
                if(isPalin){
                    if(answer.length() < j-i+1){
                        answer = s.substring(i,j+1);
                    }
                }
            }
        }
        
        return answer;
    }
}