class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int [targets.length];
        int[] spell = new int['Z'-'A'+ 1];
        
        for(int i=0; i<spell.length; i++){
            int min=Integer.MAX_VALUE;
            for(String k: keymap){
                if(k.indexOf('A'+i)==-1){
                    continue;
                }else if(k.indexOf('A'+i)+1<min){
                    min=k.indexOf('A'+i)+1;
                }
            }
            if(min == Integer.MAX_VALUE){
                spell[i] = -1;
            } else{
                spell[i] = min;
            }
        }
        
        for(int t=0; t<targets.length; t++){
            for(int w=0; w<targets[t].length(); w++){
                if(spell[targets[t].charAt(w)-'A']==-1){
                    answer[t] = -1;
                    break;
                }
                answer[t]+=spell[targets[t].charAt(w)-'A'];
            }
        }
        
        return answer;
    }
}