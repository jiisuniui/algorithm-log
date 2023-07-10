package string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main_1302_베스트셀러 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int n = scann.nextInt();
        Map<String, Integer> books = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String str = scann.next();
            if (books.containsKey(str)) {
                books.put(str, books.get(str) + 1);
            } else {
                books.put(str, 1);
            }
        }

        int maxSell = 0;
        for (String key : books.keySet()) {
            if (books.get(key) > maxSell) {
                maxSell = books.get(key);
            }
        }
        List<String> bestseller = new ArrayList<>();
        for (String key : books.keySet()) {
            if (books.get(key) == maxSell) {
                bestseller.add(key);
            }
        }
        Collections.sort(bestseller);
        System.out.println(bestseller.get(0));

    }

}
