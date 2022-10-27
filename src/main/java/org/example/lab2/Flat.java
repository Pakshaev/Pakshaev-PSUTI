package org.example.lab2;
public class  Flat {

    private int flatSquare; //площадь квартиры
    private int roomsAmount; //количество комнат в квартире

    private final int BASE_ROOM_AMOUNT = 2; //значение по умолчанию для количества комнат
    private final int BASE_FLAT_SQUARE = 50; //значение по умолчанию для площади квартиры

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


    public void setFlatSquare(int flatSquare) { //установить площадь квартиры
        this.flatSquare = flatSquare;
    }


    public void setRoomsAmount(int roomsAmount) { //установить количество комнат в квартире
        this.roomsAmount = roomsAmount;
    }

    public int getRoomsAmount() { //получить количество комнат в квартире
        return roomsAmount;
    }

    public int getFlatSquare() { //получить площадь квартиры
        return flatSquare;
    }

}
