package com.example;

public class Perro extends Mascota {

    public Perro(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau");
    }

    @Override
    public void alimentar() {
        System.out.println("El perro se alimenta comida comida.");
    }

    @Override
    public void cuidar() {
        System.out.println("El perro necesita, baños, paseos, etc");
    }
}