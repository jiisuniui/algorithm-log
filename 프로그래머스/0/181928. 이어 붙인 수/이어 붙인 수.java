class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;
        int even = 0;
        
        for(int i=0; i<num_list.length; i++){
            int n = num_list[i];
            if(n%2==0){
                even = even*10 + n;
            }else {
                odd = odd*10 + n;
            }
        }
        answer = even+odd;
        
        return answer;
    }
}