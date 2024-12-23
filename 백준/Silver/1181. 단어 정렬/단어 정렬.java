import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scann.next());
        }

        Set<String> set = new HashSet<>(list);
        List<String> distinct = new ArrayList<>(set);

        Collections.sort(distinct, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) == o2.charAt(i)) {
                            continue;
                        }
                        return o1.charAt(i) - o2.charAt(i);
                    }
                    return 0;
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        for (int i = 0; i < distinct.size(); i++) {
            System.out.println(distinct.get(i));
        }
    }
}
