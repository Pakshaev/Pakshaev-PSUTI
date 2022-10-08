package org.example.task1;

import org.junit.Assert;
import org.junit.Test;
import java.util.regex.Pattern;


public class ApplicationTest {
    Shortener shortener = new Shortener();

    public ApplicationTest() {
    }

    @Test
    public void test_two_different_URLs() {
        String shortURL1 = this.shortener.urlShortener("https://www.codewars.com/kata/5ef9ca8b76be6d001d5e1c3e");
        Assert.assertTrue("Wrong string format!", testFormat(shortURL1));
        String shortURL2 = this.shortener.urlShortener("https://www.codewars.com/kata/5efae11e2d12df00331f91a6");
        Assert.assertTrue("Wrong string format!", testFormat(shortURL2));
        Assert.assertEquals("https://www.codewars.com/kata/5ef9ca8b76be6d001d5e1c3e", this.shortener.urlRedirector(shortURL1));
        Assert.assertEquals("https://www.codewars.com/kata/5efae11e2d12df00331f91a6", this.shortener.urlRedirector(shortURL2));
    }

    @Test
    public void test_same_URLs() {
        String shortURL1 = this.shortener.urlShortener("https://www.codewars.com/kata/5ef9c85dc41b4e000f9a645f");
        Assert.assertTrue("Wrong string format!", testFormat(shortURL1));
        String shortURL2 = this.shortener.urlShortener("https://www.codewars.com/kata/5ef9c85dc41b4e000f9a645f");
        Assert.assertTrue("Wrong string format!", testFormat(shortURL2));
        Assert.assertEquals("Should work with same URLs", shortURL1, shortURL2);
        Assert.assertEquals("https://www.codewars.com/kata/5ef9c85dc41b4e000f9a645f", this.shortener.urlRedirector(shortURL1));
    }

    private static boolean testFormat(String string) {
        return Pattern.matches("^short.ly\\/[a-z]{1,4}$", string);
    }
}
