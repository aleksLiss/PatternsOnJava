package org.example.structular.abstractFactory.transpImpl;

import org.example.structular.abstractFactory.transpInterfaces.Car;

public class Dodge implements Car {
    @Override
    public void go() {
        System.out.println("Dodge is starting");
    }
}
