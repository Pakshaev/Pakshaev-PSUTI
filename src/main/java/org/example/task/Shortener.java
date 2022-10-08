package org.example.task;

import java.util.*;
import java.lang.*;

public class Shortener {

    private static HashMap<String, String> shortMap = new HashMap<>();
    private static HashMap<String, String> longMap = new HashMap<>();
    private static char[] ALP = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public static String BASE_URL = "short.ly/";
    private static int dataBaseSize = 0;
    private static int[] loopCounters = new int[]{0};
    private static char[] counter = new char[]{'a'};
    private static boolean endLoop = false;

    public static String urlShortener(String longURL){
        String shortedURL = "";

        if(longMap.containsKey(longURL)){
            return longMap.get(longURL);
        }
        else{
            shortedURL = BASE_URL + generatePath ();
            shortMap.put(shortedURL, longURL);
            longMap.put(longURL, shortedURL);
            dataBaseSize++;
        }

        return shortedURL;
    }

    public static String urlRedirector(String shortURL){
        return shortMap.get(shortURL);
    }

    private static String generatePath() {
        String shortURL = "";

        //проверка предела счетчика,если достигнут, то с новой буквой создаем
        if(isCounterLimit()){
            counter = new char[counter.length + 1];
            loopCounters = new int[loopCounters.length + 1];
            Arrays.fill(counter, 'a');
            Arrays.fill(loopCounters, 1);
        }
        else{
            //если дойти до последней буквы - цикл начинается заново
            endLoop = false;
            for(int i = counter.length; i > 0; i--){
                if(endLoop || i == counter.length){
                    if(loopCounters[i - 1] == ALP.length){
                        loopCounters[i - 1] = 0;
                        endLoop = true;
                    }
                    else {
                        endLoop = false;
                    }
                    counter[i - 1] = ALP[loopCounters[i - 1]];
                    loopCounters[i - 1] = (loopCounters[i - 1] + 1);
                }
            }
        }
        return new String(counter);
    }

    //счетчик пределов
    private static boolean isCounterLimit(){
        double pow = 0;
        for(int i=1; i<=counter.length; i++){
            pow += Math.pow(ALP.length, i);
        }
        return dataBaseSize == pow;
    }

}