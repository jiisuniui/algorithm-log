// import java.util.*;

// class Solution {
//     public int solution(String s) {
//         int answer = 0;
//         List<String> list = new ArrayList<>();
        
//         while(!s.equals("")){
//             char first = s.charAt(0);
//             int fnum = 1;
//             int onum = 0;
//             int i=1;
//             for(i=1; i<s.length(); i++){
//                 if(first == s.charAt(i)){
//                     fnum++;
//                 } else {
//                     onum++;
//                 }
//                 if(fnum==onum){ 
//                     list.add(s.substring(0,i+1));
//                     s=s.substring(i+1,s.length());
//                     break;
//                 }
//             }
            
//             if(i==s.length()){
//                 if(s.equals("")){
//                     break;
//                 }
//                 list.add(s);
//                 s="";
//                 break;
//             }
//         }
        
//         return list.size();
//     }
// }

import java.util.*;

class Solution {
    public int solution(String s) {
        List<String> list = new ArrayList<>();
        
        int fnum = 0, onum = 0; 
        int startIdx = 0; // start index of the current substring

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(startIdx)){
                fnum++;
            } else {
                onum++;
            }
            
            if(fnum == onum){
                list.add(s.substring(startIdx, i+1));
                startIdx = i+1; // set start index for the next substring
                fnum = 0; // reset counters
                onum = 0;
            }
        }

        // If there's any remaining string after the loop, add it to the list
        if(startIdx < s.length()){
            list.add(s.substring(startIdx));
        }
        
        return list.size();
    }
}