import pro.learnup.javaqa.group2.chernykh.Addition;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {


        int[] speeds = {0, 6, 9};

            System.out.println("Количество выбывших игроков: " + Addition.droppedOut(speeds));
            System.out.println("Скорость выбывших игроков: " + Arrays.toString(Addition.speedDroppedOut(speeds)));
            System.out.println("Скорость не выбывших игроков: " + Arrays.toString(Addition.speedStayedIn(speeds)));
    }
}








