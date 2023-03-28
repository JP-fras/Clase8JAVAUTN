package org.example;

public class Main {
    public static void main(String[] args) {
        Persona unaPersona = new Persona();
        unaPersona.setNombre("Juan Pablo Frascino");
        unaPersona.setDni("45908194");

        Persona otraPersona = new Persona("Jorge Migueles", 23, "23987654");
        System.out.println(otraPersona.toString());
    }
}