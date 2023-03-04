package medium;

import java.util.Arrays;

public class task_1124 {

    public static void main(String[] args) {
        int[] tmp = {6,6,9};
        System.out.println(longestWPI(tmp));
    }

    public static int longestWPI(int[] hours) {
        int[] deltas = new int[hours.length];
        int counter = 1;


        for (int i = 0; i < hours.length; i++) {
            if (hours[i] > 8) {
                deltas[i] = ++counter;
            } else if (counter != 0) {
                deltas[i] = --counter;
            }
        }

        Arrays.sort(deltas);
        System.out.println("c: " + counter);
        System.out.println("d: " + deltas[deltas.length - 1]);

        if (counter == 0 && deltas[deltas.length - 1] > 8) {
            return 1;
        }
        return deltas[deltas.length - 1];
    }
}
