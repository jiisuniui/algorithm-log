import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        int M = scann.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scann.nextInt());
        }
        Collections.sort(list);

        int end = N - 1;
        int start = 0;

        int count = 0;
        while (start < end) {
            int sum = list.get(start) + list.get(end);
            if (sum < M) {
                start++;
            } else if (sum > M) {
                end--;
            } else {
                count++;
                start++;
                end--;
            }
        }

        System.out.println(count);
    }
}
