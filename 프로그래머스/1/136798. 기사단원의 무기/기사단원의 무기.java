class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1; i<=number; i++){
            int n=0;
            int root=(int)Math.sqrt(i);
            
            for(int j=1; j<=root; j++){
                if(j*j == i){
                    n++;
                }else if(i%j==0){
                    n+=2;
                }
                
                if(n>limit){
                    break;
                }
            }
            
            if(n>limit){
                n=power;
            }
            answer+=n;
        }
        
        return answer;
    }
}