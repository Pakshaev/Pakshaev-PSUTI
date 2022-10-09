package org.example.lab2;

public class DwellingFloor
{
    static int amountFlatsOnFloor;
    static int[] floorNumber;

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
    }


}
