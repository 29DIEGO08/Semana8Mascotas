package com.example;

public class Tortuga extends Mascota {

    public Tortuga(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("TORTUGA");
    }

    @Override
    public void alimentar() {
        System.out.println("La tortuga se alimenta comida comida.");
    }

    @Override
    public void cuidar() {
        System.out.println("La tortuga necesita, baños, paseos, etc");
    }
}
