package org.example.structular.abstractFactory.factoryImpl;

import org.example.structular.abstractFactory.aircraftImpl.Tu134;
import org.example.structular.abstractFactory.carImpl.Lada;
import org.example.structular.abstractFactory.factoryInterfaces.TransportFactory;
import org.example.structular.abstractFactory.transpInterfaces.Aircraft;
import org.example.structular.abstractFactory.transpInterfaces.Car;

public class RussiaFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Lada();
    }

    @Override
    public Aircraft createAircraft() {
        return new Tu134();
    }
}
