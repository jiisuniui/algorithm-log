import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] a ={1,2,3,4,5};
        int[] b ={2,1,2,3,2,4,2,5};
        int[] c ={3,3,1,1,2,2,4,4,5,5};
        
        int as=0,bs=0,cs=0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==a[i%a.length]){
                as++;
            }
            if(answers[i]==b[i%b.length]){
                bs++;
            }
            if(answers[i]==c[i%c.length]){
                cs++;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        int max=Math.max(as,Math.max(bs,cs));
        if(max==as){
            list.add(1);
        }
        if(max==bs){
            list.add(2);
        }
        if(max==cs){
            list.add(3);
        }
        
        answer=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}