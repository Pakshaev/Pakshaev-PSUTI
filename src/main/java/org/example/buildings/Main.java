package org.example.buildings;

class Main {

    public static void main(String[] args) {
        DwellingFloor floor = new DwellingFloor(5);
        Flat flat = new Flat(120, 4);
        floor.addNewFlat(5, flat);
        System.out.println(floor);
        floor.deleteFlat(2);
        System.out.println(floor);
        Flat flat1 = new Flat(120, 5);
        Flat flat2 = new Flat(90, 3);
        Flat flat3 = new Flat(180, 9);
        Flat flat4 = new Flat(777, 66);
    }
}