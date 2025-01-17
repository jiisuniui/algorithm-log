import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int N, M;
    static List<List<Integer>> friend = new ArrayList<>();
    static boolean existFriend = false;

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        N = scann.nextInt();
        M = scann.nextInt();
        for (int i = 0; i < N; i++) {
            friend.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            int a = scann.nextInt();
            int b = scann.nextInt();
            friend.get(a).add(b);
            friend.get(b).add(a);
        }

        for (int i = 0; i < N; i++) {
            boolean[] visited = new boolean[N];
            visited[i] = true;
            dfs(i, 1, visited);

            if (existFriend) {
                break;
            }
        }

        System.out.println(existFriend ? "1" : "0");
    }

    public static void dfs(int who, int depth, boolean visited[]) {
        if (existFriend) {
            return;
        }

        if (depth == 5) {
            existFriend = true;
            return;
        } else {
            for (int f : friend.get(who)) {
                if (!visited[f]) {
                    visited[f] = true;
                    dfs(f, depth + 1, visited);
                    visited[f] = false;
                }
            }
        }
    }
}
