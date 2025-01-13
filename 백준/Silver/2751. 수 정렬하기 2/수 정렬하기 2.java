import java.io.*;

public class Main {
    public static int[] arr;
    public static int[] tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        tmp = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        sort(0, N - 1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
    }

    public static void sort(int s, int e) {
        if (e - s < 1) {
            return;
        }

        int m = s + (e - s) / 2;
        sort(s, m);
        sort(m + 1, e);

        for (int i = s; i <= e; i++) {
            tmp[i] = arr[i];
        }

        int i = s;
        int j = m + 1;
        int go = s;
        while (i <= m && j <= e) {
            if (tmp[i] <= tmp[j]) {
                arr[go++] = tmp[i++];
            } else {
                arr[go++] = tmp[j++];
            }
        }

        while (i <= m) {
            arr[go++] = tmp[i++];
        }

        while (j <= e) {
            arr[go++] = tmp[j++];
        }
    }

}
