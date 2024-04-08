class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for(int i=0; i<queries.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=queries[i][1]; j>=queries[i][0]; j--){
                sb.append(answer.charAt(j));
            }
            answer = answer.substring(0,queries[i][0]) + sb.toString() + answer.substring(queries[i][1]+1, my_string.length());
        }
        return answer;
    }
}