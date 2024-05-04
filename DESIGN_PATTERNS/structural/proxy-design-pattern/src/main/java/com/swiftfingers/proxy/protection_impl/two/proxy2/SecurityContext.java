package com.swiftfingers.proxy.protection_impl.two.proxy2;


public class SecurityContext {
    public static String username = "root";
    public static String password = "1234";
    public static String role = "ADMIN";

    public static void authenticate(String un, String pwd, String r){
        username = un;
        password = pwd;
        role = r;
    }
}