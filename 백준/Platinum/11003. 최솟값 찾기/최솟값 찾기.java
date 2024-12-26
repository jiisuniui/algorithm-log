import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 1; i <= N; i++) {

            if (i - L + 1 > 1) {
                if (dq.peekFirst() == A[i - L]) {
                    dq.removeFirst();
                }
            }

            for (;;) {
                if (!dq.isEmpty()) {
                    if (dq.peekLast() > A[i]) {
                        dq.removeLast();
                    } else {
                        dq.addLast(A[i]);
                        break;
                    }
                } else {
                    dq.addLast(A[i]);
                    break;
                }
            }

            sb.append(dq.peekFirst());
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
