package com.swiftfingers.factory1;

public class ChineseFood extends AbstractFood {
    String itemName;
    int quantity;
    boolean delivered;

    public ChineseFood(String itemName, int quantity){
        this.itemName = itemName;
        this.quantity = quantity;
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
}