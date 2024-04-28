package org.example.structular.abstractFactory.carImpl;

import org.example.structular.abstractFactory.transpInterfaces.Car;

public class Lada implements Car {
    @Override
    public void go() {
        System.out.println("Lada is starting");
    }
}
