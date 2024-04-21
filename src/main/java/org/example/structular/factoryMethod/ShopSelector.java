package org.example.structular.factoryMethod;

public class ShopSelector {

    public Shop getShop(TypeOfShops shop){
        Shop resultShop = null;
        switch (shop){
            case GUNS:
                resultShop = new GunShop();
                break;
            case ANIMALS:
                resultShop = new AnimalShop();
                break;
            case CLOTHES:
                resultShop = new ClothesShop();
                break;
        }
        return resultShop;
    }
}
