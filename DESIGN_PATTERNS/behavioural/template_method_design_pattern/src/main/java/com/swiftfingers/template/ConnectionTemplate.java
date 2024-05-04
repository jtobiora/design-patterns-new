package com.swiftfingers.template;

/*
* The abstract class provides steps to connect, communicate and later to close the connections. All these steps are
* required in order to get the work done. The class provides default implementation to some common steps and leaves the
* specific steps as abstract which force the client to provide an implementation to them.
* The setDBDriver method should be implemented by the user to provide database specific drivers. The credentials could
* be different for different databases; therefore, setCredentials is also left as abstract to let the user to implement it.
* Similarly, connecting to the database using JDBC API and preparing a statement is common. But, data would be specific
* so user will provide it, and rest of other steps like running an insert statement, closing connections and destroying
* object are similar to any database, therefore their implementations are kept common inside the template.
* The key method of the above class is the run method. The run method is used to run these steps in order. The method
* is set as final because the steps should be kept safe and should not be change by any user.
* */
public abstract class ConnectionTemplate {
    //template method
    public final void run() {
        setDBDriver();
        setCredentials();
        connect();
        prepareStatement();
        setData();
        insert();
        close();
        destroy();
    }

    public abstract void setDBDriver();
    public abstract void setCredentials();

    public void connect() {
        System.out.println("Setting connection...");
    }
    public void prepareStatement() {
        System.out.println("Preparing insert statement...");
    }
    public abstract void setData();
    public void insert() {
        System.out.println("Inserting data...");
    }
    public void close() {
        System.out.println("Closing connections...");
    }
    public void destroy() {
        System.out.println("Destroying connection objects...");
    }
}
