import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        long answer = 0;

        String[] splitMinus = str.split("-");
        for (int i = 0; i < splitMinus.length; i++) {
            String[] splitPlus = splitMinus[i].split("\\+");
            long sum = 0;
            for (int j = 0; j < splitPlus.length; j++) {
                sum += Integer.parseInt(splitPlus[j]);
            }

            if (i == 0) {
                answer += sum;
            } else {
                answer -= sum;
            }
        }

        System.out.println(answer);
    }
}
