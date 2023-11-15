class Solution {
    public long solution(long n) {
        long answer = 0;
        long x = (long)Math.sqrt(n);
        if(n == x*x){
            answer = (x+1) * (x+1);
        }else {
            answer = -1;
        }
        return answer;
    }
}