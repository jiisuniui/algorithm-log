class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int X=x;
        int n=0;
        while(X>0){
            n += X%10;
            X /= 10;
        }
        
        if(x%n == 0){
            answer=true;
        }else{
            answer=false;
        }
        
        return answer;
    }
}