class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] yes = {"aya","ye","woo","ma"};
        String[] no = {"ayaaya","yeye","woowoo","mama"};
        boolean[] impos = new boolean[babbling.length];
        
        for(int i=0; i<babbling.length; i++){
            for(String w:no){
                if(babbling[i].contains(w)){
                    impos[i] = true; 
                    break;
                }
            }
        }
        
        
        for(int i=0; i<babbling.length; i++){
            if(impos[i]){
                continue;
            }
            
            String b=babbling[i];
            while(!b.equals("")){
                boolean find = false;
                for(String w:yes){
                    if(b.length()>=w.length()){
                        if(b.substring(0,w.length()).equals(w)){
                            b = b.substring(w.length(),b.length());
                            find = true;
                            break;
                        }
                    }
                }
                if(!find){
                    break;
                }
                
                if(b.equals("")){
                        answer++;
                        break;
                }
            }
        }
        return answer;
    }
}