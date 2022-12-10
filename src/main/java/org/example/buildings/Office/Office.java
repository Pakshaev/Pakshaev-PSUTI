package org.example.buildings.Office;

public class Office {
    private final int BASE_ROOM_AMOUNT = 1;
    private final int BASE_FLAT_SQUARE = 250;

    private int officeSquare;
    private int officeRoomsAmount;

    /*Конструктор по умолчанию создает офис из 1 комнаты площадью 250 кв.м. (константы)*/
    public Office() {
        this.officeRoomsAmount = BASE_ROOM_AMOUNT;
        this.officeSquare = BASE_FLAT_SQUARE;
    }

    /*Конструктор может принимать площадь офиса (создается офис с 1 комнатой).*/
    public Office(int officeSquare) {
        this.officeSquare = officeSquare;
        this.officeRoomsAmount = BASE_ROOM_AMOUNT;
    }

    /*Конструктор может принимать площадь офиса и количество комнат.*/
    public Office(int officeSquare, int officeRoomsAmount){
        this.officeSquare = officeSquare;
        this.officeRoomsAmount = officeRoomsAmount;
    }

    /*Создайте метод получения количества комнат в офисе.*/
    public int getOfficeRoomsAmount() {
        return officeRoomsAmount;
    }

    /*Создайте метод изменения количества комнат в офисе.*/
    public void setOfficeRoomsAmount(int officeRoomsAmount){
        this.officeRoomsAmount = officeRoomsAmount;
    }

    /*Создайте метод получения площади офиса.*/
    public int getOfficeSquare() {
        return officeSquare;
    }

    /*Создайте метод изменения площади офиса.*/
    public void setOfficeSquare(int officeSquare){
        this.officeSquare = officeSquare;
    }
}