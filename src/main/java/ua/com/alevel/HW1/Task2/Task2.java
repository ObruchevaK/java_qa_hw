package ua.com.alevel.HW1.Task2;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void countCharacters() {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (hm.get(str.charAt(i))!=null) {
                int temp = hm.get(str.charAt(i));
                hm.put(str.charAt(i), ++temp);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }
        System.out.println(hm);
    }
}
