package org.example.lab2;
public class DwellingFloor {
    private Flat[] flats;

    public DwellingFloor(int count) {
        flats = new Flat[count];
    }

    public DwellingFloor(Flat[] flats) {
        this.flats = flats;
    }

    public int getAmountFlatsOnFloor() {
        return flats.length;
    }

    public int getSquareFlatsOnFloor() {
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i].getFlatSquare();
        }
        return sum;
    }

    public int getTotalRooms() {
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i].getRoomsAmount();
        }
        return sum;
    }

    public Flat[] getArrayFlats() {
        return flats;
    }

    public Flat getFlat(int number) {
        return flats[number];
    }

    public void changeFloor(int floorNumber, Flat floorLink){ //изменение квартиры по номеру и ссылке на квартиру
        if(floorNumber < flats.length && floorNumber>=0 && floorLink != null){
            flats[floorNumber] = floorLink;}
    }

    public void addNewFlat(int floorNumber, Flat floorLink){ //добавление новой квартиры по номеру и ссылке на квартиру
        if(floorNumber >= flats.length && floorLink != null){
            flats[floorNumber] = floorLink;}
    }

    public void deleteFlat(int floorNumber){
        flats[floorNumber] = null;
    }

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



    //static int amountFlatsOnFloor;
/*    static int[] floorNumber;

    public DwellingFloor(int amountFlatsOnFloor) {
        DwellingFloor.amountFlatsOnFloor = amountFlatsOnFloor;
    }

    public DwellingFloor(int[] floorNumber) {
        DwellingFloor.floorNumber = floorNumber;
    }

    public int getAmountFlatsOnFloor(){
        return amountFlatsOnFloor;
    }

    public int getSquareFlatsOnFloor(){
        return amountFlatsOnFloor*Flat.flatSquare;
    }

    public int getAmountRoomsOnFloor(){
        return amountFlatsOnFloor*Flat.roomsAmount;
    }

    public void getNumbersFlatOnFloor(){
        for (int el:DwellingFloor.floorNumber) {
            System.out.println(el);
        }
    }*/


}
