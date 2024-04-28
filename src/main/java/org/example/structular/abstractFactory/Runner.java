package org.example.structular.abstractFactory;

import org.example.structular.abstractFactory.factoryImpl.RussiaFactory;
import org.example.structular.abstractFactory.factoryImpl.USAFactory;
import org.example.structular.abstractFactory.factoryInterfaces.TransportFactory;
import org.example.structular.abstractFactory.transpInterfaces.Aircraft;
import org.example.structular.abstractFactory.transpInterfaces.Car;

public class Runner {
    private static TransportFactory transportFactory;
    public static void main(String[] args) {

        boolean currentFactory = false;

        if(!currentFactory){
            transportFactory = new RussiaFactory();
        }else {
            transportFactory = new USAFactory();
        }

        Aircraft aircraft = transportFactory.createAircraft();
        Car car = transportFactory.createCar();

        aircraft.fly();
        car.go();
    }
}
