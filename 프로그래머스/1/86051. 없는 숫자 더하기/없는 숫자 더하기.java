class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] isNum = new boolean[10];
        for(int i:numbers){
            isNum[i] = true;
        }
        for(int i=0; i<10; i++){
            if(!isNum[i]){
                answer+=i;
            }
        }
        return answer;
    }
}