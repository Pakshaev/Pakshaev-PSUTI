package org.example.buildings;

class Main {

    public static void main(String[] args) {
        Flat flat1 = new Flat();
        Flat flat2 = new Flat(75);
        Flat flat3 = new Flat(55, 3);
        Flat flat4 = new Flat();
        Flat flat5 = new Flat(90);
        Flat flat6 = new Flat(160, 2);

        Flat[] flatArr1 = new Flat[3];
        flatArr1[0] = flat1;
        flatArr1[1] = flat2;
        flatArr1[2] = flat3;
        Flat[] flatArr2 = new Flat[3];
        flatArr2[0] = flat4;
        flatArr2[1] = flat5;
        flatArr2[2] = flat6;

        DwellingFloor floor1 = new DwellingFloor(2);
        DwellingFloor floor2 = new DwellingFloor(flatArr1);
        DwellingFloor floor3 = new DwellingFloor(flatArr2);

        /*System.out.println(floor2.getAmountFlatsOnFloor());
        System.out.println(floor2.getTotalSquareFlatsOnFloor());
        System.out.println(floor2.getTotalAmountOfRoomsOnFloor());
        System.out.println(floor2.getFlat(2));

        flat1.setRoomsAmount(60);
        flat2.setFlatSquare(1020);
        System.out.println(flat1.getRoomsAmount());
        System.out.println(flat2.getFlatSquare());*/

        System.out.println(floor2.getAmountFlatsOnFloor());
        System.out.println(floor2.getTotalAmountOfRoomsOnFloor());
        System.out.println(floor2.getTotalSquareFlatsOnFloor());

        Flat flat228 = new Flat(100, 6);
        floor2.changeFloor(1, flat228);

        System.out.println(floor2.getAmountFlatsOnFloor());
        System.out.println(floor2.getTotalAmountOfRoomsOnFloor());
        System.out.println(floor2.getTotalSquareFlatsOnFloor());


    }
}