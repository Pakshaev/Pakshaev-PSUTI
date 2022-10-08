package org.example.task2;

import java.lang.Math;

public class Compare {
    public static int comparePowers(int[] number1, int[] number2) {
        double val1 = Math.log(number1[0]) * number1[1];
        double val2 = Math.log(number2[0]) * number2[1];
        return Double.compare(val2, val1);
    }
}