package com.swiftfingers;


//Interface showing different type of items (Elements) to be used in shopping cart.
public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}
