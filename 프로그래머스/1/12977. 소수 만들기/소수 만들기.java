class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int n = nums[i] + nums[j] + nums[k];
                    boolean isDecimal = true;
                    for(int m=2; m<n; m++){
                        if(n%m==0){
                            isDecimal=false;
                            break;
                        }
                    }
                    if(isDecimal){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}