package org.example.lab2;



class Main {



    public static void main(String[] args) {
    Flat flat1 = new Flat();
    Flat flat2 = new Flat(75);
    Flat flat3 = new Flat(55,3);
    Flat flat4 = new Flat();
    Flat flat5 = new Flat(90);
    Flat flat6 = new Flat(160,2);
    
    Flat[] flatArr1 = new Flat[3];
    flatArr1[0] = flat1;
    flatArr1[1] = flat2;
    flatArr1[2] = flat3;

    Flat[] flatArr2 = new Flat[3];
    flatArr2[0] = flat4;
    flatArr2[1] = flat5;
    flatArr2[2] = flat6;


        System.out.println(flat3.getFlatSquare());
        System.out.println(flat3.getRoomsAmount());
        flat3.setFlatSquare(70);
        flat3.setRoomsAmount(4);
        System.out.println(flat3.getFlatSquare());
        System.out.println(flat3.getRoomsAmount());
        
        
    
    }
}