package com.swiftfingers.template;

public class TestTemplatePattern {
    public static void main(String[] args) {
        System.out.println("For MYSQL....");
        ConnectionTemplate template = new MySqLCSVConn();
        template.run();
        System.out.println("For Oracle...");
        template = new OracleTxtConn();
        template.run();
    }
}
