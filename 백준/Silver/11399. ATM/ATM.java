import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scann.nextInt());
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) <= list.get(i)) {
                continue;
            }
            if (list.get(0) >= list.get(i)) {
                int target = list.remove(i);
                list.add(0, target);
                continue;
            }
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(j) <= list.get(i)) {
                    int target = list.remove(i);
                    list.add(j + 1, target);
                    break;
                }
            }
        }

        Long time = 0L;
        for (int i = 0; i < list.size(); i++) {
            time += list.get(i) * (list.size() - i);
        }
        System.out.println(time);
    }
}
