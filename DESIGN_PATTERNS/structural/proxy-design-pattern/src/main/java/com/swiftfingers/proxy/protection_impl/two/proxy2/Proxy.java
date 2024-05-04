package com.swiftfingers.proxy.protection_impl.two.proxy2;

public class Proxy implements IService {

    private IService service;

    public Proxy(IService service){
        this.service = service;
    }

    @Override
    public double compute(int parameter) {
        double result = service.compute(parameter);
        return result;
    }
}