import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        for (;;) {
            int[] len = new int[3];
            len[0] = scann.nextInt();
            len[1]= scann.nextInt();
            len[2] = scann.nextInt();

            if (len[0] == 0 && len[1] == 0 && len[2] == 0) {
                break;
            }

            Arrays.sort(len);
            if (len[0] * len[0] + len[1] * len[1] == len[2] * len[2]) {
                System.out.println("right"); 
            } else {
                System.out.println("wrong");
            }
        }
    }
}