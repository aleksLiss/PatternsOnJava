package org.example.structular.factoryMethod;

public class GunShop implements Shop{
    @Override
    public void startOfWork() {
        System.out.println("Shop is opening!");
    }

    @Override
    public void endOfWork() {
        System.out.println("Shop is closing!");
    }

    @Override
    public void sailProduct() {
        System.out.println("Gun was sold");
    }
}
