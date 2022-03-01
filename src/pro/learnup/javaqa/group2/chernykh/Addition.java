package pro.learnup.javaqa.group2.chernykh;

import java.util.Arrays;

public class Addition {

    public static int droppedOut(int[] speeds) {
        int start = 0;
        for (int speed : speeds) {
            if (speed > 0) {
                start++;
            }
        }
        return start;
    }

    public static int[] speedDroppedOut(int[] speeds) {
        int cnt = 0;
        for (int speed : speeds) {
            if (speed > 0) {
                cnt++;
            }
        }
        int[] second = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (speed > 0) {
                second[i] = speed;
                i++;
            }
        }
        return second;
    }

    public static int[] speedStayedIn(int[] speeds) {
        int cnt = 0;
        for (int speed : speeds) {
            if (speed == 0) {
                cnt++;
            }
        }
        int[] third = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (speed == 0) {
                third[i] = speed;
                i++;
            }
        }
        return third;
    }
}

