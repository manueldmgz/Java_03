package com.generation;

public class Main {

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        boolean z = true;

        System.out.println("Ejercicio A es " + ((x && y) || (x && z)));
        System.out.println("Ejercicio B es " + ((x || !y) && (!x || z)));
        System.out.println("Ejercicio C es " + (x || y && z));
        System.out.println("Ejercicio D es " + (!(x || y) && z));
        System.out.println("Ejercicio E es " + (x || y || x && !z && !y));
        System.out.println("Ejercicio F es " + (!x || !y || z && x && !y));
    }
}
