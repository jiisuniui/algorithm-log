class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        //String answer = "";
        
        int i=0;
        int j=0;
        
        for(int g=0; g<goal.length; g++){
            if(i<cards1.length && goal[g].equals(cards1[i])){
                i++;
            }else if(j<cards2.length && goal[g].equals(cards2[j])){
                j++;
            }else{
                return "No";
            }
        }
        
        return "Yes";
    }
}