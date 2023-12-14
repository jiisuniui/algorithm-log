class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];

        int a=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j==0){
                    i=(int)(left/n);
                    j=(int)(left%n);
                }
                if((long)i*n+(long)j>right){
                    break;
                }
                if(i>=j){
                    answer[a++]=i+1;
                }
                else{
                    answer[a++]=j+1;
                }
            }
        }

        return answer;
    }
}