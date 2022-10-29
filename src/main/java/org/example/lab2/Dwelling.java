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

    public void changeFloor (int number, DwellingFloor flat){ //изменение этажа (принимает номер этажа и ссылку на обновлённый этаж)
        floors[number] = flat;
    }

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

    public void changeFlatInDwelling(int number, Flat objFlat){

        Flat currentFlat = getFlatOnDwelling(number);
        currentFlat = objFlat;
    }

    public void AddFlatInDwelling(int number, Flat objFlat) {
       int numberCurrentFlat = getNumberFlatOnFlor(number);
       DwellingFloor currentFloor = getFloorOnDwelling(number);
       Flat[] newFlatsArray = new Flat[currentFloor.getAmountFlatsOnFloor()+1];
       int delta = 0;
       for (int i = 0; i<currentFloor.getAmountFlatsOnFloor()+1; i++){
           if (i != numberCurrentFlat){
               newFlatsArray[i] = currentFloor.getArrayFlats()[i-delta];
           } else {
               newFlatsArray[i] = objFlat;
               delta = 1;
           }
           }
       currentFloor.changeFlatsArray(newFlatsArray);
       }

    public void DeleteFlatInDwelling(int number){
        int numberCurrentFlat = getNumberFlatOnFlor(number);
        DwellingFloor currentFloor = getFloorOnDwelling(number);
        Flat[] newFlatsArray = new Flat[currentFloor.getAmountFlatsOnFloor()-1];
        int delta = 0;
        for (int i = 0; i<currentFloor.getAmountFlatsOnFloor()+1; i++){
            if (i != numberCurrentFlat){
                newFlatsArray[i-delta] = currentFloor.getArrayFlats()[i];
            } else {
                delta = 1;
            }
        }
        currentFloor.changeFlatsArray(newFlatsArray);
    }

    public Flat getBestSpace(){
        Flat BestFlat = null;
        int BestSpace = 0;
        for(int i = 0; i<floors.length; i++) {
            if (floors[i].getBestSpace().getFlatSquare() > BestSpace) {
                BestSpace = floors[i].getBestSpace().getFlatSquare();
                BestFlat = floors[i].getBestSpace();
            }
        }
        return BestFlat;
    }

    public Flat[] getSortFlatArray(){
        Flat[] newArrFlat = new Flat[getTotalAmountOfFlatsInBuilding()];
        DwellingFloor[] newArrFloors = new DwellingFloor[getTotalAmountOfFloorsInBuilding()];
        int count = 0;
        for (int i = 0; i < newArrFloors.length; i++){
            for (int j = 0; j < newArrFloors[i].getArrayFlats().length; j++){
                newArrFlat[count] = newArrFloors[i].getArrayFlats()[j];
                count++;
            }
        }

        int swap = 0;
        while (swap != 0){
            swap = 0;
            for (int i =0; i<newArrFlat.length-1; i++)
                if(newArrFlat[i].getFlatSquare() < newArrFlat[i+1].getFlatSquare()){
                    Flat _flat = newArrFlat[i];
                    newArrFlat[i+1] = newArrFlat[i];
                    newArrFlat[i] = _flat;
                    swap++;
                }
        }


        return newArrFlat;
    }



    public DwellingFloor getFloorOnDwelling(int numberFlat){
        int count = 0;
        for (int i = 0; i < floors.length; i++) {
            count += floors[i].getAmountFlatsOnFloor();
            if (count > numberFlat) {
                return floors[i];
            }
        } return null;
    }

    public int getNumberFlatOnFlor(int number){
        int count = 0;
        int AmountFlatOnFlor = 0;

        for (int i = 0; i < floors.length; i++) {
            count += floors[i].getAmountFlatsOnFloor();
            if (count > number) {
                AmountFlatOnFlor = floors[i].getAmountFlatsOnFloor();
                return AmountFlatOnFlor - (count - number);
            }
        } return -1;
    }

}
