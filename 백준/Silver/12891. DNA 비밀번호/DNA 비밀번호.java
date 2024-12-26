import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int S = scann.nextInt();
        int P = scann.nextInt();
        char[] dna = scann.next().toCharArray();

        String alpha = "ACGT";
        int[] min = new int[4];
        for (int i = 0; i < 4; i++) {
            min[i] = scann.nextInt();
        }

        int[] have = new int[4];
        int count = 0;
        for (int i = 0; i < P; i++) {
            have[alpha.indexOf(dna[i])]++;
        }

        for (int i = 0; i < S - P + 1; i++) {
            if (i != 0) {
                have[alpha.indexOf(dna[i - 1])]--;
                have[alpha.indexOf(dna[i + P - 1])]++;
            }

            boolean ok = true;
            for (int j = 0; j < 4; j++) {
                if (have[j] < min[j]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                count++;
            }
        }

        System.out.println(count);
    }
}
