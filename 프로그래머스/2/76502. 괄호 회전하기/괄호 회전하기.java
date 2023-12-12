import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i=0; i<s.length(); i++){
            Stack<Character> stack = new Stack<>();
            boolean isPossible = true;
            
            s = s.substring(1,s.length()) + s.substring(0,1);
            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);
                
                if(c=='(' || c=='[' || c=='{'){
                    stack.push(c);
                }else if(c==')' || c==']' || c=='}'){
                    if(stack.isEmpty()){
                        isPossible=false;
                        break;
                    }
                    
                    char p = stack.pop();
                    if(c==')'){
                        if(p!='('){
                            isPossible=false;
                            break;
                        }
                    }else if(c==']'){
                        if(p!='['){
                            isPossible=false;
                            break;
                        }
                    }else if(c=='}'){
                        if(p!='{'){
                            isPossible=false;
                            break;
                        }
                    }
                }
            }
            if(stack.isEmpty() && isPossible){
                answer++;
            }
        }
        return answer;
    }
}