class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        char[][] map = new char[park.length][park[0].length()];
        
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++){
                map[i][j] = park[i].charAt(j);
                if(map[i][j]=='S'){
                    answer[0]=i;
                    answer[1]=j;
                }
            }
        }
        
        //E,S,W,N
        int[] dr={0,1,0,-1};
        int[] dc={1,0,-1,0};
        for(String route:routes){
            char charway = route.charAt(0);
            String stringsize = route.substring(2,route.length());
            int way = 0;
            int size = Integer.parseInt(stringsize);
            boolean nogo = false;
            
            int x=answer[0];
            int y=answer[1];
            
            if(charway=='E'){
                way = 0;
            } else if(charway=='S'){
                way = 1;
            } else if(charway=='W'){
                way = 2;
            } else if(charway=='N'){
                way = 3;
            }
            
            for(int i=0; i<size; i++){
                x += dr[way];
                y += dc[way];
                if(!checked(x,y,map.length,map[0].length) || map[x][y]=='X'){
                    nogo = true;
                }
            
            }
            
            if(nogo){
                continue;
            }
            answer[0] = x;
            answer[1] = y;
        }
        
        return answer;
    }
    
    public boolean checked(int x, int y, int R, int C) {
        return x>=0 && x<R && y>=0 && y<C;
    }
}