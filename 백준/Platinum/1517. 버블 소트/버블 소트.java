import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr, tmp;
    static long swap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        tmp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sort(0, N - 1);
        System.out.println(swap);
    }

    public static void sort(int s, int e) {
        if (e - s < 1) {
            return;
        }

        int m = (s + e) / 2;
        sort(s, m);
        sort(m + 1, e);

        for (int i = s; i <= e; i++) {
            tmp[i] = arr[i];
        }

        int go = s;
        int i = s;
        int j = m + 1;

        while (i <= m && j <= e) {
            if (tmp[i] <= tmp[j]) {
                arr[go++] = tmp[i++];
            } else {
                swap += j - go;
                arr[go++] = tmp[j++];
            }
        }

        while (i <= m) {
            arr[go++] = tmp[i++];
        }

        while (j <= e) {
            swap += j - go;
            arr[go++] = tmp[j++];
        }
    }
}
