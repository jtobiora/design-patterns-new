package com.swiftfingers.proxy.protection_impl.two.proxy2;

public class LoggingProxy implements IService {

    private IService service;

    public LoggingProxy(IService service){
        this.service = service;
    }

    @Override
    public double compute(int parameter) {
        System.out.println("Logging Proxy >>>> " +parameter);
        long t1 = System.currentTimeMillis();
        double result = service.compute(parameter);
        long t2 = System.currentTimeMillis();
        System.out.println("Duration => "+(t2 - t1));
        return result;
    }
}
