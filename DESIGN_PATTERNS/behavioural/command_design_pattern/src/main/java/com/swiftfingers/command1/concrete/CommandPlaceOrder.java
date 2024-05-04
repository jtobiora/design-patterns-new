package com.swiftfingers.command1.concrete;

import com.swiftfingers.command1.Command;
import com.swiftfingers.command1.receiver.Order;

//Concrete Command
public class CommandPlaceOrder implements Command {

    private Order order;

    public CommandPlaceOrder(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        this.order.setOrderPlaced(true);
        System.out.println(this.order);
    }

}