package com.swiftfingers.proxy.protection_impl.two.proxy2;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        SecurityContext.authenticate("root", "1234", "root");
        context.setService(new SecurityProxy(
                new CacheProxy(
                        new LoggingProxy(
                                new ServiceImpl()
                        )
                )
        ));
        context.compute(10);
        context.compute(20);
        context.compute(30);
        context.compute(10);
        context.compute(40);
        context.compute(20);


    }
}