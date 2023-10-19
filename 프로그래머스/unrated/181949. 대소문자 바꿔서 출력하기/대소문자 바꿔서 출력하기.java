import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        int up = 'A'-'a';
        int down = 'a'-'A';
        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            if('a'<=ch && ch<='z'){
                answer += (char)(ch+up);
            } else if('A'<=ch && ch<='Z'){
                answer += (char)(ch+down);
            }
        }
        
        System.out.println(answer);
    }
}