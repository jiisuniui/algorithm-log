class Solution {
    public int reverse(int x) {
        long answer = 0;
        if(x>=0){
            while(x>0){
                answer = answer*10 + x%10;
                x = (int)(x/10);
            }
        }else{
            x = x*-1;
            while(x>0){
                answer = answer*10 + x%10;
                x = (int)(x/10);
            }
            answer *= -1;
        }
        
        if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)answer;
    }
}
