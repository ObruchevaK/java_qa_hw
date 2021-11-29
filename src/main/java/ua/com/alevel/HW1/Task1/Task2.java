package ua.com.alevel.HW1.Task1;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void task2() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (hm.get(str.charAt(i))) {
                int temp = hm.get(str.charAt(i));
                hm.put(str.charAt(i), ++temp);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }
    }
}
