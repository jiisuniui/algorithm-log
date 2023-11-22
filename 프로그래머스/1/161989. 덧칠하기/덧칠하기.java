class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] paint = new boolean[section.length];
        
        int painted = 0;
        for(int i=0; i<section.length; i++){
            if(!paint[i]){
                if(painted<section[i]){
                    answer++;
                    painted=section[i]+m-1;
                }
            }
        }
        
        
        return answer;
    }
}