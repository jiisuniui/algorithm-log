class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int x=0;    //가로
        int y=0;    //세로 
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>sizes[i][1]){
                if(x<sizes[i][0]){
                    x=sizes[i][0];
                }
                if(y<sizes[i][1]){
                    y=sizes[i][1];
                }
            }else{
                if(x<sizes[i][1]){
                    x=sizes[i][1];
                }
                if(y<sizes[i][0]){
                    y=sizes[i][0];
                }
            }
        }
        
        answer=x*y;
        return answer;
    }
}