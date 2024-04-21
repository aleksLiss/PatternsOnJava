package org.example.structular.factoryMethod;

public class Main {

    public static void main(String[] args) {
        CarSelector carSelector = new CarSelector();
        Car car = carSelector.getCar(TypeOfCar.AUDI);
        car.start();
        car.stop();
    }
}
