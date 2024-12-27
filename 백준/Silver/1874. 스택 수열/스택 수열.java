import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scann.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int a = 0;
        for (int i = 1; i <= n; i++) {
            stack.push(i);
            sb.append("+");

            while (!stack.isEmpty() && stack.peek() == arr[a]) {
                stack.pop();
                sb.append("-");
                a++;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            String str = sb.toString();
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        }

    }
}
