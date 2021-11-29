package ua.com.alevel.HW1.Task1;

import java.util.Scanner;

public class Task1 {
    public static void sumOfNumbers(){
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] chars = str.toCharArray();

        int sum=0;
        for (int i = 0; i < chars.length; i++) {
            if(Character.isDigit(chars[i]))
                sum+= Character.getNumericValue(chars[i]);
        }
        System.out.println(sum);
    }
}
