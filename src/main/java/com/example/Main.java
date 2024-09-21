package com.example;

public class Main {

    public static void main(String[] args) {
        Perro perro = new Perro("Max", "Canino", "Labrador", 3, "Mediano", "Dorado", "Saludable");
        
        Gato gato = new Gato("Garfiel", "Felino", "Siames", 2, "Pequeño", "Gris", "Saludable");
        
        Pajaro pajaro = new Pajaro("Piolin", "Ave", "Canario", 1, "Pequeño", "Amarillo", "Saludable");
        
        Tortuga tortuga = new Tortuga("Rafael", "Reptil", "tierra", 5, "Grande", "Azul", "Saludable");

        System.out.println("Perro:");
        perro.mostrarInformacion();
        perro.hacerSonido();
        perro.alimentar();
        perro.cuidar();

        System.out.println("\n Gato:");
        gato.mostrarInformacion();
        gato.hacerSonido();
        gato.alimentar();
        gato.cuidar();

        System.out.println("\n Pájaro:");
        pajaro.mostrarInformacion();
        pajaro.hacerSonido();
        pajaro.alimentar();
        pajaro.cuidar();

        System.out.println("\n Información de la Tortuga:");
        tortuga.mostrarInformacion();
        tortuga.hacerSonido();
        tortuga.alimentar();
        tortuga.cuidar();
    }
}