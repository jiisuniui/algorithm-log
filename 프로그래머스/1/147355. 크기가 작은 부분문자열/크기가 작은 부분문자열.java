class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pl = Long.parseLong(p);
        for(int i=0; i<t.length()-p.length()+1; i++){
            String str = t.substring(i,i+p.length());
            if(Long.parseLong(str)<=pl){
                answer++;
            }
        }
        return answer;
    }
}