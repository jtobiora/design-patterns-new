package com.swiftfingers.prototype;

import java.util.HashMap;
import java.util.Map;


/*
 * We have used an AccessControlProvider class that creates and stores the possible AccessControl objects in advance.
 * And when the there’s a request to an AccessControl object, it returns a new object created by copying the
 * stored prototypes.
 * Here we create the access control objects on all levels at once, and
 * then provide a copy of the object to the user whenever required. In this case, data fetching from the external resources
 * happens only once. Next time, the access control object is created by copying the existing one.
 * The access control object is not created from scratch every time the request is sent; this approach will
 * certainly reduce object creation time.
 * */
public class AccessControlProvider {

    private static Map<String, AccessControl> map = new HashMap<>();

    static {
        System.out.println("Fetching data from external resources and creating access control objects...");
        map.put("USER", new AccessControl("USER", "DO_WORK"));
        map.put("ADMIN", new AccessControl("ADMIN", "ADD/REMOVE USERS"));
        map.put("MANAGER", new AccessControl("MANAGER", "GENERATE/READ REPORTS"));
        map.put("VP", new AccessControl("VP", "MODIFY REPORTS"));
    }

    /*
    * This method fetches a stored prototype object according to the controlLevel passed to it,
    * from the map and returns a newly created cloned object to the client code.
    * */
    public static AccessControl getAccessControlObject(String controlLevel) {
        AccessControl ac = null;
        ac = map.get(controlLevel);
        if (ac != null) {
            return ac.clone();
        }
        return null;
    }

}
