package org.example.structular.factoryMethod;

public class Audi implements Car{
    @Override
    public void start() {
        System.out.println("Audi is starting");
    }

    @Override
    public void stop() {
        System.out.println("Audi is stopping");
    }
}
