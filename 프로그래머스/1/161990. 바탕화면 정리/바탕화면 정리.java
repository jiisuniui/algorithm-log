class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        char[][] map = new char[wallpaper.length+1][wallpaper[0].length()+1];
        
        for(int i=1; i<map.length; i++){
            for(int j=1; j<map[i].length; j++){
                map[i][j] = wallpaper[i-1].charAt(j-1);
            }
        }
        
        answer[0] = Integer.MAX_VALUE;
        answer[1] = Integer.MAX_VALUE;
        answer[2] = 0;
        answer[3] = 0;
      
        
        for(int i=1; i<map.length; i++){
            for(int j=1; j<map[i].length; j++){
                if(map[i][j] == '#'){
                    if(i<answer[0]){
                        answer[0]=i;
                    }
                    if(j<answer[1]){
                        answer[1]=j;
                    }
                    if(i>answer[2]){
                        answer[2]=i;
                    }
                    if(j>answer[3]){
                        answer[3]=j;
                    }
                }
            }
        }
        
        answer[0]--;
        answer[1]--;
        
        return answer;
    }
}