package org.example.task1;

import java.util.ArrayList;
import java.util.HashMap;

public class Shortener {
    private static ArrayList<String> words;
    private int counter;
    private HashMap<String, String> database, database2;

    static {
        words = new ArrayList<>();
        String[] a = new String[]{" ","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for (int i=0;i<27;i+=1) {
            for (int j=0;j<27;j+=1) {
                for (int k=0;k<27;k+=1) {
                    for (int l=1;l<27;l+=1) {
                        String buffer = (a[i]+a[j]+a[k]+a[l]).trim();
                        if (!buffer.contains(" ")) words.add(buffer);
                    }
                }
            }
        }
    }

    public Shortener() {
        counter = 0;
        database = new HashMap<>();
        database2 = new HashMap<>();
    }

    public String urlShortener(String longURL) {
        if (database.containsKey(longURL)) return database.get(longURL);
        database.put(longURL, "short.ly/"+words.get(counter));
        database2.put("short.ly/"+words.get(counter), longURL);
        counter++;
        return database.get(longURL);
    }
    public String urlRedirector(String shortURL) {
        if (database2.containsKey(shortURL))
            return database2.get(shortURL);
        return "ERROR!";
    }
    public static void main(String[] args) {
        Shortener shortener = new Shortener();
        String shortURL1 = shortener.urlShortener("https://www.codewars.com/kata/5ef9ca8b76be6d001d5e1c3e");
        String shortURL2 = shortener.urlShortener("https://www.codewars.com/kata/5ef9ca8b76beds01d5e1c3e");
        System.out.println(shortener.urlShortener(shortURL1));
        System.out.println(shortener.urlShortener(shortURL2));
        System.out.println(shortener.urlRedirector(shortURL1));
        System.out.println(shortener.urlRedirector(shortURL2));
    }
}
