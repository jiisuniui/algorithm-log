class Solution {
    public String[] solution(String[] str_list) {
        String[] answer;
        String where = "";
        int location = -1;
        int len = str_list.length;
        
        for(int i=0; i<len; i++){
            if(str_list[i].equals("l")){
                where = "left";
                location = i;
                break;
            } else if(str_list[i].equals("r")){
                where = "right";
                location = i;
                break;
            }
        }
        
        if(where.equals("left")){
            answer = new String[location];
            for(int i=0; i<location; i++){
                answer[i] = str_list[i];
            }
        } else if(where.equals("right")){
            answer = new String[len-location-1];
            
            for(int i=location+1; i<len; i++){
                answer[i-location-1] = str_list[i];
            }
        } else{
            answer = new String[0];
        }
        return answer;
    }
}