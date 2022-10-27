package org.example.lab2;

public class Dwelling {
    private int amountOfFloors = 0; //количество этажей в доме
    private DwellingFloor[] floors = new DwellingFloor[amountOfFloors]; //массив этажей в доме

    public Dwelling(int amountOfFloors) { this.amountOfFloors = amountOfFloors; } //конструктор инициализации количества этажей в доме

    public Dwelling(DwellingFloor[] floors) { //конструктор инициализации массива этажей и количества этажей в доме
        this.floors = floors;

        this.amountOfFloors = floors.length;
    }

    public int getTotalAmountOfFloorsInBuilding(){ //получить общее количество этажей дома
        return amountOfFloors;
    }

    public int getTotalAmountOfFlatsInBuilding(){ //получить общее количество квартир дома
        int count = 0;
        for (int i = 0; i < floors.length; i++) {
            count += floors[i].getAmountFlatsOnFloor();
        }
        return count;
    }

    public int getTotalSquareOfFlatsInBuilding(){ //получить общую площадь квартир дома
        int square = 0;
        for (int i = 0; i < floors.length; i++) {
            square += floors[i].getTotalSquareFlatsOnFloor();
        }
        return square;
    }

    public int getTotalAmountOfRoomsInBuilding(){ //получить общее количество комнат в доме
        int rooms = 0;
        for (int i = 0; i < floors.length; i++) {
            rooms += floors[i].getTotalAmountOfRoomsOnFloor();
        }
        return rooms;
    }

    public DwellingFloor[] getArrayOfFloorsInBuilding(){ //получить массив этажей дома
        return floors;
    }

    public DwellingFloor getFlatOnFloor(int number) { //получить этаж по его номеру в доме
        return floors[number];
    }

    /*public void changeFloor (DwellingFloor flat, int number){ //изменение этажа (принимает номер этажа и ссылку на обновлённый этаж)
        floors[number] = flat;
    }*/







    public int getAmountFlatsOnFloor() {
        return flats.length;
    }


}
