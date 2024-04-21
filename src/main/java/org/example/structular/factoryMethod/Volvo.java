package org.example.structular.factoryMethod;

public class Volvo implements Car{
    @Override
    public void start() {
        System.out.println("Volvo is starting");
    }

    @Override
    public void stop() {
        System.out.println("Volvo is stopping");
    }
}
