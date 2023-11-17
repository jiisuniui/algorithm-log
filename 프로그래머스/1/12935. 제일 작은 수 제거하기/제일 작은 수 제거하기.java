class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length==1){
            answer = new int[1];
            answer[0]=-1;
            return answer;
        }
        
        int min = arr[0];
        int sum=1;
        for(int i=1; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
                sum=1;
            }else if(min==arr[i]){
                sum++;
            }
        }
        
        answer = new int[arr.length-sum];
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(min==arr[i]){
                continue;
            }
            answer[index] = arr[i];
            index++;
        }
        
        return answer;
    }
}