import java.io.*;
import java.util.*;

public class Main {

    public static class Number implements Comparable<Number> {
        int key;
        int value;

        public Number(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int compareTo(Number o) {
            if (this.value == o.value) {
                return this.key - o.key;
            } else {
                return this.value - o.value;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Number[] numbers = new Number[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = new Number(i, Integer.parseInt(br.readLine()));
        }

        Arrays.sort(numbers);
        int res = 0;
        for (int i = 0; i < N; i++) {
            if (res < numbers[i].key - i) {
                res = numbers[i].key - i;
            }
        }
        System.out.println(res+1);
    }

}
