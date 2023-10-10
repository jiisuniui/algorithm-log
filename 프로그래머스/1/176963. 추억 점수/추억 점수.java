class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int t=0; t<photo.length; t++){
            for(String p: photo[t]){
                for(int i=0; i<name.length; i++){
                    if(p.equals(name[i])){
                        answer[t] += yearning[i];
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}