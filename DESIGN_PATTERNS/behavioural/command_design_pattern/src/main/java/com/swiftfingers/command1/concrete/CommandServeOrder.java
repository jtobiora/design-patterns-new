package com.swiftfingers.command1.concrete;

import com.swiftfingers.command1.Command;
import com.swiftfingers.command1.receiver.Order;

//Concrete Command
public class CommandServeOrder implements Command {

    private Order order;

    public CommandServeOrder(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        this.order.setOrderServed(true);
        System.out.println(this.order);
    }

}