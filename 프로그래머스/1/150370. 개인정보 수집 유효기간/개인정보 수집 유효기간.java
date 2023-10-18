
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer;
        
        Queue<Integer> queue = new LinkedList<>();
        int ty=Integer.parseInt(today.substring(0,4));
        int tm=Integer.parseInt(today.substring(5,7));
        int td=Integer.parseInt(today.substring(8,10));
        
        for(int i=0; i<privacies.length; i++){
            String pr = privacies[i];
            
            int year=0;
            int month=0;
            int day=0;
            for(int j=0; j<terms.length; j++){
                if(pr.charAt(pr.length()-1)==(terms[j].charAt(0))){
                    String t=terms[j];
                    int m = Integer.parseInt(t.substring(2,t.length()));
                    
                    year = Integer.parseInt(pr.substring(0,4));
                    month = Integer.parseInt(pr.substring(5,7))+m;
                    while (month > 12){
                        year++;
                        month-=12;
                    }
                    day = Integer.parseInt(pr.substring(8,10));
                    break;
                }
            }
            
           
            // 문제에서는 현재날짜 전에 만료일이면 폐기인데
            // 현재는 현재날짜와 만료일이 같아도 폐기로 설정
            if(year<ty){
                queue.add(i+1);
            }else if(year==ty){
                if(month<tm){
                    queue.add(i+1);
                }else if(month==tm){
                    if(day<=td){
                        queue.add(i+1);
                    }
                }
            }
        }
 
        answer = new int[queue.size()];
        int q=0;
        while(!queue.isEmpty()){
            answer[q] = queue.poll();
            q++;
        }
        
        return answer;
    }
}