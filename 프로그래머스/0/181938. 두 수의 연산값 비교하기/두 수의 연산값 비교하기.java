class Solution {
    public int solution(int a, int b) {
        int bsize = Integer.toString(b).length();
        int x = (int)(a * Math.pow(10,bsize)) + b;
        int y = 2*a*b;
        if(x>=y){
            return x;
        } else{
            return y;
        }
    }
}