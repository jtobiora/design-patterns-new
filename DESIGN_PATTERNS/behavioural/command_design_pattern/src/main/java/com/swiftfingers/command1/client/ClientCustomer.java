package com.swiftfingers.command1.client;

import com.swiftfingers.command1.concrete.CommandCookOrder;
import com.swiftfingers.command1.concrete.CommandPlaceOrder;
import com.swiftfingers.command1.concrete.CommandServeOrder;
import com.swiftfingers.command1.concrete.CommandValidateOrder;
import com.swiftfingers.command1.invoker.Cook;
import com.swiftfingers.command1.invoker.Manager;
import com.swiftfingers.command1.invoker.Waiter;
import com.swiftfingers.command1.receiver.Order;

//Client
public class ClientCustomer {

    public ClientCustomer() {

        Order myOrder = new Order("Veg Burger", 2);


        //Place Order
        CommandPlaceOrder cmdPlaceOrder = new CommandPlaceOrder(myOrder);

        Waiter waiter = new Waiter();
        waiter.setCommand(cmdPlaceOrder);
        waiter.takeOrder();


        //Validate Order
        CommandValidateOrder cmdValidateOrder = new CommandValidateOrder(myOrder);

        Manager manager = new Manager();
        manager.setCommand(cmdValidateOrder);
        manager.validateOrder();

        CommandCookOrder cmdCookOrder = new CommandCookOrder(myOrder);

        Cook cook = new Cook();
        cook.setCommand(cmdCookOrder);
        cook.prepareOrder();


        CommandServeOrder cmdServeOrder = new CommandServeOrder(myOrder);

        waiter.setCommand(cmdServeOrder);
        waiter.serveOrder();
    }

}