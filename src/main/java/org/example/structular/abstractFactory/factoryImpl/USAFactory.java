package org.example.structular.abstractFactory.factoryImpl;

import org.example.structular.abstractFactory.aircraftImpl.Boeing747;
import org.example.structular.abstractFactory.carImpl.Dodge;
import org.example.structular.abstractFactory.factoryInterfaces.TransportFactory;
import org.example.structular.abstractFactory.transpInterfaces.Aircraft;
import org.example.structular.abstractFactory.transpInterfaces.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Dodge();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
