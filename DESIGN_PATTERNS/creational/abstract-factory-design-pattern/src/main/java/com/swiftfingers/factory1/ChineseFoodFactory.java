package com.swiftfingers.factory1;

public class ChineseFoodFactory extends AbstractFoodFactory {

    @Override
    public AbstractFood placeOrder(String itemName, int quantity) {
        return new ChineseFood(itemName,quantity);
    }

}
