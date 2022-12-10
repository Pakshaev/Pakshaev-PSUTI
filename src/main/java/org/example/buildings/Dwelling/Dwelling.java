package org.example.buildings.Dwelling;

public class Dwelling {
    private DwellingFloor[] floors; //массив этажей в доме

    /*Конструктор может принимать массив этажей дома.*/
    public Dwelling(DwellingFloor[] floors) {
        this.floors = floors;
    }

    /*Конструктор может принимать количество этажей и массив количества квартир по этажам.*/
    public Dwelling(int amountOfFloors, DwellingFloor[] floors) {
        this.floors = new DwellingFloor[amountOfFloors];
        this.floors = floors;
    }

    /*Создайте метод получения общего количества этажей дома.*/
    public int getTotalAmountOfFloorsInBuilding() {
        return floors.length;
    }

    /*Создайте метод получения общего количества квартир дома.*/
    public int getTotalAmountOfFlatsInBuilding() {
        int count = 0;
        for (int i = 0; i < floors.length; i++) {
            count += floors[i].getAmountFlatsOnFloor();
        }
        return count;
    }

    /*Создайте метод получения общей площади квартир дома.*/
    public int getTotalSquareOfFlatsInBuilding() {
        int square = 0;
        for (int i = 0; i < floors.length; i++) {
            square += floors[i].getTotalSquareFlatsOnFloor();
        }
        return square;
    }

    /*Создайте метод получения общего количества комнат дома.*/
    public int getTotalAmountOfRoomsInBuilding() {
        int rooms = 0;
        for (int i = 0; i < floors.length; i++) {
            rooms += floors[i].getTotalAmountOfRoomsOnFloor();
        }
        return rooms;
    }

    /*Создайте метод получения массива этажей жилого дома.*/
    public DwellingFloor[] getArrayOfFloorsInBuilding() {
        return floors;
    }

    /*Создайте метод получения объекта этажа, по его номеру в доме.*/
    public DwellingFloor getFlatOnFloor(int number) {
        return floors[number];
    }

    /*Создайте метод изменения этажа по его номеру в доме и ссылке на обновленный этаж.*/
    public void changeFloor(int number, DwellingFloor flat) {
        floors[number] = flat;
    }

    /*Создайте метод получения объекта квартиры по ее номеру в доме.*/
    public Flat getFlatOnDwelling(int number) {
        int count = 0;
        int numberFlatOnFlor = 0;
        int AmountFlatOnFlor = 0;
        if (number <= getTotalAmountOfFlatsInBuilding()) {
            for (int i = 0; i < floors.length; i++) {
                count += floors[i].getAmountFlatsOnFloor();
                if (count > number) {
                    AmountFlatOnFlor = floors[i].getAmountFlatsOnFloor();
                    numberFlatOnFlor = AmountFlatOnFlor - (count - number);
                    return floors[i].getFlat(numberFlatOnFlor);
                }
            }
        }
        return null;
    }

    /*Создайте метод изменения объекта квартиры по ее номеру в доме и ссылке на объект квартиры.*/
    public void changeFlatInDwelling(int number, Flat objFlat) {
        Flat currentFlat = getFlatOnDwelling(number);
        currentFlat = objFlat;
    }

    /*Создайте метод добавления квартиры в дом по будущему номеру квартиры в доме
    (т.е. в параметрах указывается номер, который должны иметь квартира после вставки)
    и ссылке на объект квартиры (количество этажей в доме при этом не увеличивается).*/
    public void AddFlatInDwelling(int number, Flat objFlat) {
        int numberCurrentFlat = getNumberFlatOnFloor(number);
        DwellingFloor currentFloor = getFloorOnDwelling(number);
        Flat[] newFlatsArray = new Flat[currentFloor.getAmountFlatsOnFloor() + 1];
        int delta = 0;
        for (int i = 0; i < currentFloor.getAmountFlatsOnFloor() + 1; i++) {
            if (i != numberCurrentFlat) {
                newFlatsArray[i] = currentFloor.getArrayFlats()[i - delta];
            } else {
                newFlatsArray[i] = objFlat;
                delta = 1;
            }
        }
        currentFloor.changeFlatsArray(newFlatsArray);
    }

    /*Создайте метод удаления квартиры по ее номеру в доме.*/
    public void DeleteFlatInDwelling(int number) {
        int numberCurrentFlat = getNumberFlatOnFloor(number);
        DwellingFloor currentFloor = getFloorOnDwelling(number);
        Flat[] newFlatsArray = new Flat[currentFloor.getAmountFlatsOnFloor() - 1];
        int delta = 0;
        for (int i = 0; i < currentFloor.getAmountFlatsOnFloor() + 1; i++) {
            if (i != numberCurrentFlat) {
                newFlatsArray[i - delta] = currentFloor.getArrayFlats()[i];
            } else {
                delta = 1;
            }
        }
        currentFloor.changeFlatsArray(newFlatsArray);
    }

    /*Создайте метод getBestSpace() получения самой большой по площади квартиры дома.*/
    public Flat getBestSpace() {
        Flat BestFlat = null;
        int BestSpace = 0;
        for (int i = 0; i < floors.length; i++) {
            if (floors[i].getBestSpace().getFlatSquare() > BestSpace) {
                BestSpace = floors[i].getBestSpace().getFlatSquare();
                BestFlat = floors[i].getBestSpace();
            }
        }
        return BestFlat;
    }

    /*Создайте метод получения отсортированного по убыванию площадей массива квартир.*/
    public Flat[] getSortFlatsArray() {
        Flat[] newArrFlat = new Flat[getTotalAmountOfFlatsInBuilding()];
        DwellingFloor[] newArrFloors = new DwellingFloor[getTotalAmountOfFloorsInBuilding()];
        int count = 0;
        for (int i = 0; i < newArrFloors.length; i++) {
            for (int j = 0; j < newArrFloors[i].getArrayFlats().length; j++) {
                newArrFlat[count] = newArrFloors[i].getArrayFlats()[j];
                count++;
            }
        }

        int swap = 0;
        while (swap != 0) {
            swap = 0;
            for (int i = 0; i < newArrFlat.length - 1; i++) {
                if (newArrFlat[i].getFlatSquare() < newArrFlat[i + 1].getFlatSquare()) {
                    Flat flat = newArrFlat[i];
                    newArrFlat[i + 1] = newArrFlat[i];
                    newArrFlat[i] = flat;
                    swap++;
                }
            }
        }
        return newArrFlat;
    }

    /*допы*/
    public DwellingFloor getFloorOnDwelling(int numberFlat) { //вернуть номер квартиры в доме
        int count = 0;
        for (int i = 0; i < floors.length; i++) {
            count += floors[i].getAmountFlatsOnFloor();
            if (count > numberFlat) {
                return floors[i];
            }
        }
        return null;
    }

    public int getNumberFlatOnFloor(int number) { //вернуть номер квартиры на этаже
        int count = 0;
        int AmountFlatOnFlor = 0;

        for (int i = 0; i < floors.length; i++) {
            count += floors[i].getAmountFlatsOnFloor();
            if (count > number) {
                AmountFlatOnFlor = floors[i].getAmountFlatsOnFloor();
                return AmountFlatOnFlor - (count - number);
            }
        }
        return -1;
    }
}
