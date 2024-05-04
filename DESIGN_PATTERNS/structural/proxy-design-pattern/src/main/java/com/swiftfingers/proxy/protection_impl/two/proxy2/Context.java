package com.swiftfingers.proxy.protection_impl.two.proxy2;

public class Context {
    private IService service;

    public void compute(int parameter){
        System.out.println("===================================");
        double result = service.compute(parameter);
        System.out.println("Result at => "+result);
        System.out.println("===================================");
    }

    public void setService(IService service) {
        this.service = service;
    }
}