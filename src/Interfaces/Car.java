package Interfaces;

public class Car implements IntCar {

    public Car(){}

    public void color(){

        System.out.println("el color es rojo");

    }

    public static void main(String[] args) {
        Car col = new Car();
        col.color();
    }

}
