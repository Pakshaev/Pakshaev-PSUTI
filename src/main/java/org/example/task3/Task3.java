package org.example.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Task3 {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> list = new LinkedList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringNumber = reader.readLine();
        int intNumber = Integer.parseInt(stringNumber);

        while (intNumber != 0) { // 0 = stop loop
            list.add(intNumber);
            stringNumber = reader.readLine();
            intNumber = Integer.parseInt(stringNumber);
        }

        for (int el : list) {
            if (list.indexOf(el) == list.lastIndexOf(el)) {
                System.out.println(el);
            }
        }
    }
}





