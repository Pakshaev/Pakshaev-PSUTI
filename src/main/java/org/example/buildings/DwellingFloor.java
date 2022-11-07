package org.example.buildings;
public class DwellingFloor {
    private Flat[] flats; //массив квартир на этаже
    /*Конструктор может принимать количество квартир на этаже.*/
    public DwellingFloor(int amountOfFlatsOnFloor) {
        this.flats = new Flat[amountOfFlatsOnFloor];
    }
    /*Конструктор может принимать массив квартир этажа.*/
    public DwellingFloor(Flat[] flats) {
        this.flats = flats;
    }
    /*Создайте метод получения количества квартир на этаже.*/
    public int getAmountFlatsOnFloor() {
        return flats.length;
    }
    /*Создайте метод получения общей площади квартир этажа.*/
    public int getTotalSquareFlatsOnFloor() {
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i].getFlatSquare();
        }
        return sum;
    }
    /*Создайте метод получения общего количества комнат этажа.*/
    public int getTotalAmountOfRoomsOnFloor() {
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i].getRoomsAmount();
        }
        return sum;
    }
    /*Создайте метод получения массива квартир этажа.*/
    public Flat[] getArrayFlats() {
        return flats;
    }
    /*Создайте метод получения объекта квартиры по ее номеру на этаже.*/
    public Flat getFlat(int number) {
        return flats[number];
    }
    /*Создайте метод изменения квартиры по ее номеру на этаже и ссылке на новую квартиру.*/
    public void changeFloor(int floorNumber, Flat floorLink){
        if(floorNumber < flats.length && floorNumber>=0 && floorLink != null){
            flats[floorNumber] = floorLink;}
    }
    /*Создайте метод добавления новой квартиры на этаже по будущему номеру квартиры
    (т.е. в параметрах указывается номер, который должны иметь квартира после вставки) и ссылке на объект квартиры.*/
    public void addNewFlat(int floorNumber, Flat floorLink){
        if(floorNumber >= flats.length && floorLink != null){
            flats[floorNumber] = floorLink;}
    }
    /*Создайте метод удаления квартиры по ее номеру на этаже.*/
    public void deleteFlat(int floorNumber){
        flats[floorNumber] = null;
    }
    /*Создайте метод getBestSpace() получения самой большой по площади квартиры этажа.*/
    public Flat getBestSpace() {
        int max = 0;
        Flat bestFlat = flats[0];

        for (int i = 0; i < flats.length; i++) {
            if (flats[i].getFlatSquare() > max ) {
                max = flats[i].getFlatSquare();
                bestFlat = flats[i];
            }
        }
        return bestFlat;
    }
    /*допы*/
    public void changeFlatsArray(Flat[] flatsArray){
        flats = null;
        flats = flatsArray;
    }
}
