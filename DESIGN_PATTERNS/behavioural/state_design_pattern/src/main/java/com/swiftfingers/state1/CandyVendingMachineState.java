package com.swiftfingers.state1;

//State interface
//Lists the operations that can be performed on the machine
public interface CandyVendingMachineState {
    void insertCoin();
    void pressButton();
    void dispense();
}
