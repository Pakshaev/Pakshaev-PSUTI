package org.example.buildings;

public class Flat {

    private int flatSquare; //площадь квартиры
    private int roomsAmount; //количество комнат в квартире

    private final int BASE_ROOM_AMOUNT = 2; //значение по умолчанию для количества комнат
    private final int BASE_FLAT_SQUARE = 50; //значение по умолчанию для площади квартиры
    /*Конструктор по умолчанию создает квартиру из 2 комнат площадью 50 кв.м. (эти числа должны быть константами в классе)*/
    public Flat() {
        this.flatSquare = BASE_FLAT_SQUARE;
        this.roomsAmount = BASE_ROOM_AMOUNT;
    }
    /*Конструктор может принимать площадь квартиры (создается квартира с 2 комнатами)*/
    public Flat(int flatSquare) {
        this.roomsAmount = BASE_ROOM_AMOUNT;
        this.flatSquare = flatSquare;
    }
    /*Конструктор может принимать площадь квартиры и количество комнат.*/
    public Flat(int flatSquare, int roomsAmount) {
        this.flatSquare = flatSquare;
        this.roomsAmount = roomsAmount;
    }

    /*Создайте метод получения количества комнат в квартире.*/
    public int getRoomsAmount() {
        return roomsAmount;
    }

    /*Создайте метод изменения количества комнат в квартире.*/
    public void setRoomsAmount(int roomsAmount) {
        this.roomsAmount = roomsAmount;
    }
    /*Создайте метод получения площади квартиры.*/
    public int getFlatSquare() {
        return flatSquare;
    }
    /*Создайте метод изменения площади квартиры.*/
    public void setFlatSquare(int flatSquare) {
        this.flatSquare = flatSquare;
    }

}
