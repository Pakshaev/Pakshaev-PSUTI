package org.example.lab2;

public class Flat {

    static int flatSquare;
    static int roomsAmount;

    public Flat()
    {
        final int baseRAmount = 2;
        final int baseFSquare = 50;
    }

    public Flat(int flatSquare)
    {
        Flat.roomsAmount = 2;
        Flat.flatSquare = flatSquare;
    }

    public Flat(int flatSquare, int roomsAmount)
    {
        Flat.flatSquare = flatSquare;
        Flat.roomsAmount = roomsAmount;
    }

    public int getRoomsAmount()
    {
        return Flat.roomsAmount;
    }

    public void changeRoomsAmount(int roomsAmount)
    {
        Flat.roomsAmount = roomsAmount;
    }

    public int getFlatSquare()
    {
        return flatSquare;
    }

    public void changeFlatSquare(int flatSquare)
    {
        Flat.flatSquare = flatSquare;
    }
}
