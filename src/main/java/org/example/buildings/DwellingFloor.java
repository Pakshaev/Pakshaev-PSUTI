package org.example.buildings;

public class DwellingFloor {
    private Flat[] flats; //массив квартир на этаже

    /*Конструктор может принимать количество квартир на этаже.*/
    public DwellingFloor(int amountOfFlatsOnFloor) {
        Flat[] flats = new Flat[amountOfFlatsOnFloor];
        for (int i = 0; i < flats.length; i++) {
            flats[i] = new Flat();
        }
        this.flats = flats;
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
    public void changeFloor(int flatNumber, Flat flatLink) {
        if (flatNumber < flats.length && flatNumber >= 0 && flatLink != null) {
            flats[flatNumber] = flatLink;
        }
    }

    /*Создайте метод добавления новой квартиры на этаже по будущему номеру квартиры
    (т.е. в параметрах указывается номер, который должны иметь квартира после вставки) и ссылке на объект квартиры.*/
    public void addNewFlat(int floorNumber, Flat floorLink) {
        if (floorNumber <= flats.length && floorNumber >= 0) {
            Flat[] newFlats = new Flat[flats.length + 1];
            int delta = 0;
            for (int i = 0; i < flats.length + 1; i++) {
                if (i == floorNumber) {
                    newFlats[floorNumber] = floorLink;
                    delta++;
                } else {
                    newFlats[i] = flats[i - delta];
                }
            }
            this.flats = newFlats;
        }
    }

    /*Создайте метод удаления квартиры по ее номеру на этаже.*/
    public void deleteFlat(int floorNumber) {
        if (floorNumber < flats.length && floorNumber >= 0) {
            Flat[] newFlats = new Flat[flats.length - 1];
            int delta = 0;
            for (int i = 0; i < flats.length; i++) {
                if (i != floorNumber) {
                    newFlats[i - delta] = flats[i];
                } else {
                    delta++;
                }
            }
            this.flats = newFlats;
        }
    }

    public Flat getBestSpace() {
        int max = 0;
        Flat bestFlat = flats[0];

        for (int i = 0; i < flats.length; i++) {
            if (flats[i].getFlatSquare() > max) {
                max = flats[i].getFlatSquare();
                bestFlat = flats[i];
            }
        }
        return bestFlat;
    }

    /*допы*/
    public void changeFlatsArray(Flat[] flatsArray) {
        flats = flatsArray;
    }

    @Override
    public String toString() {
        StringBuilder a = new StringBuilder();
        for (Flat flat : flats) {
            a.append(flat).append("\n");
        }
        return a.toString();
    }
}