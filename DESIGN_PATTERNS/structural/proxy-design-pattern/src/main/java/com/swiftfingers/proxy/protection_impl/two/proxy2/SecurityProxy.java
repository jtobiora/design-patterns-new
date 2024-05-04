package com.swiftfingers.proxy.protection_impl.two.proxy2;

public class SecurityProxy implements IService {

    private IService service;

    public SecurityProxy(IService service){
        this.service = service;
    }
    @Override
    public double compute(int parameter) {
        System.out.println("Security Proxy >>>> " +parameter);
        if(!SecurityContext.role.equals("root")){
            throw new RuntimeException("Not Authorized");
        }
        double result = service.compute(parameter);
        return result;
    }
}