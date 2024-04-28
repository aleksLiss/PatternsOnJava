package org.example.structular.abstractFactory.aircraftImpl;

import org.example.structular.abstractFactory.transpInterfaces.Aircraft;

public class Tu134 implements Aircraft {
    @Override
    public void fly() {
        System.out.println("Tu134 is flying");
    }
}
