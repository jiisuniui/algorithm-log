import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String str = scann.next();

        char[] spell = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        int[] alphabet = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c <= 'Z') {
                alphabet[c - 'A']++;
            } else {
                alphabet[c - 'a']++;
            }
        }

        boolean notOne = false;
        int max = 0;
        int maxSpell = 0;
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max) {
                notOne = false;
                max = alphabet[i];
                maxSpell = i;
            } else if (alphabet[i] == max) {
                notOne = true;
            }
        }

        if (notOne) {
            System.out.println("?");
        } else {
            char ans = spell[maxSpell];
            System.out.println(ans);
            
        }
    }
}
