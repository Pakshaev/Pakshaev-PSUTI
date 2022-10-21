package org.example.task4;
import java.util.Scanner;
import java.util.ArrayList;

public class Task4 {
    static Scanner scanner = new Scanner(System.in);
    static int k = scanner.nextInt();

    static int[] arr = {-3, 0, 1, 3, 4};

    public static ArrayList<Integer> sort(int _k){
        ArrayList<Integer> _arr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i+j==_k){
                    _arr.add(i);
                    _arr.add(j);
                }
            }
            if(_arr.size() == 2){
                break;
            }
        }
        return _arr;
    }

    public static void main(String[] args) {
        System.out.println(sort(k));
    }
}




