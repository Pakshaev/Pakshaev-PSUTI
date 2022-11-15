package org.example.buildings;

public class OfficeFloor {

    private Office[] officeFloor;

    /*Работа класса должна быть основана на односвязном циклическом списке офисов с выделенной головой.*/
    public class LinkList {

        private Node head;

        LinkList(){
            head = null;
        }

        public class Node {
            public int data;
            public Node next;

            public Node(int data){
                this.data = data;
                next = null;
            }
        }

        public Node getHead() {
            return head;
        }

        /*
        private boolean isEmpty(){
            return head == null;
        }*/

        /*Создайте приватный метод добавления узла в список по номеру.*/
        public void add(int data){
           Node newNode = new Node(data);
           Node currentNode = head;

           if(head==null){
               head=newNode;
           }
           else{
               while (currentNode.next!=null){
                   currentNode = currentNode.next;
               }
               currentNode.next = newNode;
           }
        }

        /*Создайте приватный метод получения узла по его номеру.*/
        public Node get(int data) {
            return head;
        }

        /*Создайте приватный метод удаления узла из списка по его номеру.*/
        public void remove(int data){
            Node currentNode = head;
            Node previousNode = null;

            while (currentNode.next!=null){

                if(currentNode.data == data){
                    if(currentNode == head){
                        head=currentNode.next;
                    }
                    else {
                        previousNode.next = currentNode.next;
                    }
                }

                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
    }

    /*Конструктор может принимать количество офисов на этаже.*/
    public OfficeFloor(int floorsAmount){
        this.officeFloor = new Office[floorsAmount];
    }

    /*Конструктор может принимать массив офисов этажа.*/
    public OfficeFloor(Office[] officeFloor) {
        this.officeFloor = officeFloor;
    }

    /*Создайте метод получения количества офисов на этаже.*/
    public int getAmountOfOfficeOnFloor() {
        return officeFloor.length;
    }

    /*Создайте метод получения общей площади помещений этажа.*/
    public int getSquareOfFloor(){
        int sum=0;
        for (Office office:officeFloor) {
            sum+=office.getOfficeSquare();
        }
        return sum;
    }

    /*Создайте метод получения общего количества комнат этажа.*/
    public int getAmountOfRoomsOnFloor(){
        int sum=0;
        for (Office office:officeFloor) {
            sum+=office.getOfficeRoomsAmount();
        }
        return sum;
    }

    /*Создайте метод получения массива офисов этажа.*/
    public Office[] getOfficeFloor() {
        return officeFloor;
    }

    /*Создайте метод получения офиса по его номеру на этаже.*/
    public Office getOfficeOnFloor(int number){
        return officeFloor[number];
    }

    /*Создайте метод изменения офиса по его номеру на этаже и ссылке на обновленный офис.*/
    public void setOffice(){

    }

    /*Создайте метод добавления нового офиса на этаже по будущему номеру офиса.*/


    /*Создайте метод удаления офиса по его номеру на этаже.*/


    /*Создайте метод getBestSpace() получения самого большого по площади офиса этажа.*/
    public Office getBestSpace(){
        Office bestOffice = new Office();
        int max = officeFloor[0].getOfficeSquare();
        for (Office office:officeFloor) {
            if(max<office.getOfficeSquare()){
                max=office.getOfficeSquare();
                bestOffice = office;
            }
        }
        return bestOffice;
    }
}
