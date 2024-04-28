package org.example.structular.abstractFactory.aircraftImpl;

import org.example.structular.abstractFactory.transpInterfaces.Aircraft;

public class Boeing747 implements Aircraft {
    @Override
    public void fly() {
        System.out.println("Boeing 747 is flying");
    }
}
