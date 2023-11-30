class Solution {
    public int solution(int n) {
        int answer = 0;
        long[] F = new long[n+1];
        F[0] = 0;
        F[1] = 1;
        for(int i=2; i<=n; i++){
            F[i] = F[i-1]%1234567+F[i-2]%1234567;
        }
        answer = (int)(F[n]%1234567);
        return answer;
    }
}