package org.example.structular.factoryMethod;

public class Main {
    public static void main(String[] args) {

        ShopSelector shopSelector = new ShopSelector();
        Shop shop = shopSelector.getShop(TypeOfShops.GUNS);

        shop.startOfWork();
        shop.sailProduct();
        shop.endOfWork();

    }
}
