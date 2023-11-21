class Solution {
    public int solution(int n) {
        int answer = 0;
        
        long inverse = 0;
        while(n>0){
            inverse=(inverse*10)+(n%3);
            n/=3;
        }

        int three = 1;
        while(inverse>0){
            answer+=three*(inverse%10);
            inverse/=10;
            three*=3;
        }
        
        return answer;
    }
}