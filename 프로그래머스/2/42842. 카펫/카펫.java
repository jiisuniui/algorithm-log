class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x=0,y=0;
        
        for(x=brown/2-1; x>=1; x--){
            y=brown/2-x;
            if((x-1)*(y-1) == yellow){
                answer[0] = Math.max(x+1,y+1);
                answer[1] = Math.min(x+1,y+1);
                break;
            }
        }
        
        return answer;
    }
}