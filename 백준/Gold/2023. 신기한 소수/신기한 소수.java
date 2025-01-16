import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int N;
    static List<Integer> sosu = new ArrayList<>();
    static List<Integer> answer = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner scann = new Scanner(System.in);
        N = scann.nextInt();

        findSosu();
        for (int i = 2; i <= 9; i++) {
            findAnswer(i, 1);
        }

        Collections.sort(answer);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : answer) {
            bw.write(i + "\n");
        }
        bw.flush();
    }

    public static void findSosu() {
        int m = 0;
        for (int i = 0; i < N; i++) {
            m = m * 10 + 9;
        }
        int max = (int) Math.sqrt(m);

        sosu.add(2);
        for (int i = 2; i <= max; i++) {
            boolean isSosu = true;
            for (int s : sosu) {
                if (i % s == 0) {
                    isSosu = false;
                    break;
                }
            }
            if (isSosu) {
                sosu.add(i);
            }
        }
    }

    public static void findAnswer(int num, int jarisu) {
        if (!isSosu(num)) {
            return;
        }

        if (jarisu == N) {
            answer.add(num);
            return;
        } else if (jarisu < N) {
            for (int i = 0; i <= 9; i++) {
                findAnswer(num * 10 + i, jarisu + 1);
            }
        }
    }

    public static boolean isSosu(int num) {
        int max = (int) Math.sqrt(num);
        for (int i : sosu) {
            if (i <= max) {
                if (num % i == 0) {
                    return false;
                }
            } else {
                break;
            }
        }
        return true;
    }
}
