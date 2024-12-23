import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        String str = scann.next();
        String[] arr = str.split("");
        int answer = 0;
        for (String s : arr) {
            answer += Integer.parseInt(s);
        }
        System.out.println(answer);
    }
}
