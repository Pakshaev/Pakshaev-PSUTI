package org.example.lab2;
public class  Flat {

    private int flatSquare;
    private int roomsAmount;

    private final int BASE_ROOM_AMOUNT = 2;
    private final int BASE_FLAT_SQUARE = 50;

    public Flat() {
        this.flatSquare = BASE_FLAT_SQUARE;
        this.roomsAmount = BASE_ROOM_AMOUNT;
    }

    public Flat(int flatSquare) {
        this.roomsAmount = BASE_ROOM_AMOUNT;
        this.flatSquare = flatSquare;
    }

    public Flat(int flatSquare, int roomsAmount) {
        this.flatSquare = flatSquare;
        this.roomsAmount = roomsAmount;
    }

    public int getFlatSquare() {
        return flatSquare;
    }

    public void setFlatSquare(int flatSquare) {
        this.flatSquare = flatSquare;
    }

    public int getRoomsAmount() {
        return roomsAmount;
    }

    public void setRoomsAmount(int roomsAmount) {
        this.roomsAmount = roomsAmount;
    }
}
