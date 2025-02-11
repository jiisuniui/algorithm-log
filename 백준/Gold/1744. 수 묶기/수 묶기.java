import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scann.nextInt());
        }
        Collections.sort(list);
        scann.close();

        int answer = 0;

        for (int i = 0; i < N; i++) {
            if (list.get(i) > 0) {
                break;
            }

            if (i + 1 < N && list.get(i + 1) <= 0) {
                answer += (list.get(i) * list.get(i + 1));
                i++;
            } else {
                answer += list.get(i);
            }
        }

        for (int i = N - 1; i >= 0; i--) {
            if (list.get(i) <= 0) {
                break;
            }

            if (list.get(i) == 1) {
                answer += list.get(i);
            } else if (i - 1 >= 0 && list.get(i - 1) > 1) {
                answer += (list.get(i) * list.get(i - 1));
                i--;
            } else {
                answer += list.get(i);
            }
        }

        System.out.println(answer);
    }
}
