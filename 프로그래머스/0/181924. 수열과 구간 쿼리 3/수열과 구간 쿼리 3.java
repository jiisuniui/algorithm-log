class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for(int i=0; i<queries.length; i++){
            int x = queries[i][0];
            int y = queries[i][1];
            
            int swap = answer[x];
            answer[x] = answer[y];
            answer[y] = swap;
        }
        
        return answer;
    }
}