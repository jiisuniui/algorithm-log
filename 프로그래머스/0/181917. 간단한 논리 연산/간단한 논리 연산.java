class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean x = result(x1,x2,true);
        boolean y = result(x3,x4,true);
        boolean answer = result(x,y,false);
        
        return answer;
    }
    
    public boolean result(boolean x, boolean y, boolean isV){
        if(x && y){
            return true;
        }else if(!x && !y){
            return false;
        }else{
            if(isV){
                return true;
            }else{
                return false;
            }
        }
    }
}