package com.swiftfingers.command1.concrete;

import com.swiftfingers.command1.Command;
import com.swiftfingers.command1.receiver.Order;

//Concrete Command
public class CommandValidateOrder implements Command {

    private Order order;

    public CommandValidateOrder(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        this.order.setOrderValidated(true);
        System.out.println(this.order);
    }

}