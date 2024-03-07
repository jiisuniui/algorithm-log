class Solution {
    public int solution(int a, int b) {
        int ab = a*(int)Math.pow(10,Integer.toString(b).length()) + b;
        int ba = b*(int)Math.pow(10,Integer.toString(a).length()) + a;
        if(ab>ba){
            return ab;
        }else{
            return ba;
        }
    }
}