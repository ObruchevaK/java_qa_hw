package ua.com.alevel.HW2.Task1;

public class Task1 {
    public static void startsWith(String[] str, String keyWord) {
        for (int i = 0; i < str.length; i++) {
            if (str[i].startsWith(keyWord)) {
                System.out.println(str[i]);
            }
        }
    }

    public static void endsWith(String[] str, String keyWord) {
        for (int i = 0; i < str.length; i++) {
            if (str[i].endsWith(keyWord)) {
                System.out.println(str[i]);
            }
        }
    }

    public static void hasCommonStr(String[] str, String keyWord) {
        char[] keyWordArr = keyWord.toCharArray();
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < keyWordArr.length; j++) {
                char ch = keyWord.charAt(i);
                if (str[i].indexOf(ch) != -1) {
                    System.out.println(str[i]);
                }

            }
        }

    }
}