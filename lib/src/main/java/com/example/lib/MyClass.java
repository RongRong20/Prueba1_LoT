package com.example.lib;

public class MyClass {
    public static void main(String[] main) {
        Complejo z, w;
        z = new Complejo(-1.5, 3.0);
        w = new Complejo(-1.2, 2.4);
        z.suma(w);
        System.out.println("Complejo: " + z.toString());
        System.out.println("Hola mundo");
        System.out.println("Cambio desde android");

    }
}
