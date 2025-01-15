import java.io.*;
import java.util.Arrays;

public class Main {

    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        go(6);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
    }

    public static void go(int max) {
        int[] sort = new int[N];
        int jarisu = 1;
        int where = 1;

        while (where != max) {
            int[] count = new int[11];
            for (int i = 0; i < N; i++) {
                count[(arr[i] / jarisu) % 10 + 1]++;
            }
            for (int i = 2; i <= 10; i++) {
                count[i] += count[i - 1];
            }

            for (int i = 0; i < N; i++) {
                int a = arr[i];
                int c = (a / jarisu) % 10;
                sort[count[c]] = a;
                count[c]++;
            }

            arr = sort.clone();

            jarisu *= 10;
            where++;
        }
    }
}
