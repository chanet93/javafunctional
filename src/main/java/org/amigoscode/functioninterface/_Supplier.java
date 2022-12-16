package org.amigoscode.functioninterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionURL());
        System.out.println(getDBConnectionURLSupplier.get());
    }
     static String getDBConnectionURL (){
        return "jdbc://localhost:5432/users";
     }
    //Supplier just return any kind of value that you want
    static Supplier<String> getDBConnectionURLSupplier =  ()
            -> "jdbc://localhost:5432/users";
}
