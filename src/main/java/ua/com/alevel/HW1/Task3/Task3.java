package ua.com.alevel.HW1.Task3;

public class Task3 {
    public static void endOfLessons(int x) {
        double time = 405;
        time = 540 + (x*45) + Math.floor(x/2) * 5 + Math.floor((x-1)/2) * 15;
        int minutes = (int)time%60;
        int hours = ((int)time-minutes)/60;
        System.out.print(hours + ":" + minutes);

    }
}
