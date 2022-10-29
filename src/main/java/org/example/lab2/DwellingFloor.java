package org.example.lab2;
public class DwellingFloor {
    private int amountOfFlatsOnFloor = 0; //количество квартир на этаже
    private Flat[] flats = new Flat[amountOfFlatsOnFloor]; //массив квартир на этаже
    public DwellingFloor(int amountOfFlatsOnFloor) { //инициализации количества квартир на этаже
        this.amountOfFlatsOnFloor = amountOfFlatsOnFloor;
    }

    public DwellingFloor(Flat[] flats) { //конструктор инициализации массива квартир на этаже
        this.flats = flats;
    }

    public int getAmountFlatsOnFloor() { //получить количество квартир на этаже
        return flats.length;
    }

    public int getTotalSquareFlatsOnFloor() { //получить общую площадь квартир на этаже
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i].getFlatSquare();
        }
        return sum;
    }

    public int getTotalAmountOfRoomsOnFloor() { //получить количество комнат на этаже
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i].getRoomsAmount();
        }
        return sum;
    }


    public Flat[] getArrayFlats() { //получить массив квартир на этаже
        return flats;
    }

    public Flat getFlat(int number) { //получить объект квартиры на этаже
        return flats[number];
    }

    public void changeFloor(int floorNumber, Flat floorLink){ //изменение квартиры по номеру на этаже и ссылке на квартиру
        if(floorNumber < flats.length && floorNumber>=0 && floorLink != null){
            flats[floorNumber] = floorLink;}
    }

    public void addNewFlat(int floorNumber, Flat floorLink){ //добавление новой квартиры по номеру на этаже и ссылке на квартиру
        if(floorNumber >= flats.length && floorLink != null){
            flats[floorNumber] = floorLink;}
    }

    public void deleteFlat(int floorNumber){ //удалить квартиру по номеру на этаже
        flats[floorNumber] = null;
    }

    public Flat getBestSpace() { //получить самую большую по площади квартиру на этаже
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


    public void changeFlatsArray(Flat[] flatsArray){
        flats = null;
        flats = flatsArray;
    }


}
