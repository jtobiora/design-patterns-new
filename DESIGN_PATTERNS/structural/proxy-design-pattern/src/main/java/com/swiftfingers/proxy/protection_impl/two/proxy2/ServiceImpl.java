package com.swiftfingers.proxy.protection_impl.two.proxy2;

public class ServiceImpl implements IService {
    @Override
    public double compute(int parameter) {
        System.out.println("ServiceImpl >>>> " +parameter);
        double value = 33;
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return value*parameter;
    }
}