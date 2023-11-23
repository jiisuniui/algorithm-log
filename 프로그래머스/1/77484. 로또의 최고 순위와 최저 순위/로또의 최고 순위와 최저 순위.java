class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero=0;
        int same=0;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
                zero++;
                continue;
            }
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i]==win_nums[j]){
                    same++;
                    break;
                }
            }
        }
        
        answer[1] = rank(same);
        answer[0] = rank(same+zero);
        
        return answer;
    }
    
    public int rank(int s){
        if(s==6){
            return 1;
        }else if(s==5){
            return 2;
        }else if(s==4){
            return 3;
        }else if(s==3){
            return 4;
        }else if(s==2){
            return 5;
        }
        return 6;
    }
}