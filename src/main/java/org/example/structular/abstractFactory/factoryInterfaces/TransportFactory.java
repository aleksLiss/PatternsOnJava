package org.example.structular.abstractFactory.factoryInterfaces;

import org.example.structular.abstractFactory.transpInterfaces.Aircraft;
import org.example.structular.abstractFactory.transpInterfaces.Car;

public interface TransportFactory {

    Car createCar();
    Aircraft createAircraft();
}
