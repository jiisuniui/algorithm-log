class Solution {
    public String solution(String s) {
        String answer = "";
        String[] ss = s.split(" ");
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(String str:ss){
            int i=Integer.parseInt(str);
            max=Math.max(i,max);
            min=Math.min(i,min);
        }
        answer = min+" "+max;
        return answer;
    }
}