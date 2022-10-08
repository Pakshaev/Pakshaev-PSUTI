package myfirstpackage;


public class MySecondClass {
    private static int ex1;
    private static int ex2;

    public MySecondClass()
    {
        ex1=0;
        ex2=0;
    }

    public static int sum()
    {
        return ex1+ex2;
    }
    public void setValue1(int _ex1)
    {
        ex1 = _ex1;
    }
    public void setValue2(int _ex2)
    {
        ex2 = _ex2;
    }

    public int getValue1()
    {
        return ex1;
    }
    public int getValue2()
    {
        return ex2;
    }
}