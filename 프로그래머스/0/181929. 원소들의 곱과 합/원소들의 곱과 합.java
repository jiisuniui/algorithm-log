class Solution {
    public int solution(int[] num_list) {
        int multi = 1;
        int sum = 0;
        for(int n:num_list){
            multi *= n;
            sum += n;
        }
        int square = sum*sum;
        
        if(multi<square){
            return 1;
        } else{
            return 0;
        }
    }
}