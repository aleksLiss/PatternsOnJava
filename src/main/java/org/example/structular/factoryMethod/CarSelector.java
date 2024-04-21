package org.example.structular.factoryMethod;

public class CarSelector {

    public Car getCar(TypeOfCar car){
        Car resultCar = null;
        switch (car){
            case AUDI:
                resultCar = new Audi();
                break;
            case VOLVO:
                resultCar = new Volvo();
                break;
        }
        return resultCar;
    }
}
